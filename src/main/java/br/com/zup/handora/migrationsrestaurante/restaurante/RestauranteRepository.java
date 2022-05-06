package br.com.zup.handora.migrationsrestaurante.restaurante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    boolean existsByCnpj(String cnpj);

}
