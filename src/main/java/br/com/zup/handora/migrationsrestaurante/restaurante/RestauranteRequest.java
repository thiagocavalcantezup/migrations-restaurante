package br.com.zup.handora.migrationsrestaurante.restaurante;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

public class RestauranteRequest {

    @NotBlank
    @Size(max = 255)
    private String nomeFantasia;

    @NotBlank
    @CNPJ
    @Size(max = 18)
    private String cnpj;

    @NotBlank
    @Size(max = 120)
    private String endereco;

    @NotBlank
    @Size(max = 60)
    private String bairro;

    @NotBlank
    @Size(max = 60)
    private String cidade;

    @NotBlank
    @Size(max = 60)
    private String estado;

    @NotBlank
    @Size(max = 9)
    private String cep;

    @Size(max = 20)
    private String telefone;

    @Size(max = 20)
    private String celular;

    @Email
    @Size(max = 60)
    private String email;

    @Size(max = 120)
    private String site;

    public RestauranteRequest() {}

    public RestauranteRequest(@NotBlank @Size(max = 255) String nomeFantasia,
                              @NotBlank @CNPJ @Size(max = 18) String cnpj,
                              @NotBlank @Size(max = 120) String endereco,
                              @NotBlank @Size(max = 60) String bairro,
                              @NotBlank @Size(max = 60) String cidade,
                              @NotBlank @Size(max = 60) String estado,
                              @NotBlank @Size(max = 9) String cep, @Size(max = 20) String telefone,
                              @Size(max = 20) String celular, @Email @Size(max = 60) String email,
                              @Size(max = 120) String site) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.site = site;
    }

    public Restaurante toModel() {
        return new Restaurante(
            nomeFantasia, cnpj, endereco, bairro, cidade, estado, cep, telefone, celular, email,
            site
        );
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }

}
