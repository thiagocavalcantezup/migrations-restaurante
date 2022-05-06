package br.com.zup.handora.migrationsrestaurante.restaurante;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(RestauranteController.BASE_URI)
public class RestauranteController {

    public final static String BASE_URI = "/restaurantes";

    private final RestauranteRepository restauranteRepository;

    public RestauranteController(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid RestauranteRequest restauranteRequest,
                                    UriComponentsBuilder ucb) {

        if (restauranteRepository.existsByCnpj(restauranteRequest.getCnpj())) {
            throw new ResponseStatusException(
                HttpStatus.UNPROCESSABLE_ENTITY,
                "Já existe um restaurante cadastrado com o CNPJ fornecido."
            );
        }

        Restaurante restaurante = restauranteRepository.save(restauranteRequest.toModel());

        URI location = ucb.path(BASE_URI + "/{id}").buildAndExpand(restaurante.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
