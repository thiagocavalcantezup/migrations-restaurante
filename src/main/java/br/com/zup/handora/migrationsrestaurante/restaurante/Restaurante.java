package br.com.zup.handora.migrationsrestaurante.restaurante;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "restaurantes", uniqueConstraints = @UniqueConstraint(name = "UK_RESTAURANTE_CNPJ", columnNames = "cnpj"))
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeFantasia;

    @Column(nullable = false, length = 18)
    private String cnpj;

    @Column(nullable = false, length = 120)
    private String endereco;

    @Column(nullable = false, length = 60)
    private String bairro;

    @Column(nullable = false, length = 60)
    private String cidade;

    @Column(nullable = false, length = 60)
    private String estado;

    @Column(nullable = false, length = 9)
    private String cep;

    @Column(length = 20)
    private String telefone;

    @Column(length = 20)
    private String celular;

    @Column(length = 60)
    private String email;

    @Column(length = 120)
    private String site;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ClassificacaoRestaurante classificacao;

    @Column(nullable = false)
    private Boolean usaCupom;

    /**
     * @deprecated Construtor de uso exclusivo do Hibernate
     */
    @Deprecated
    public Restaurante() {}

    public Restaurante(String nomeFantasia, String cnpj, String endereco, String bairro,
                       String cidade, String estado, String cep, String telefone, String celular,
                       String email, String site, ClassificacaoRestaurante classificacao,
                       Boolean usaCupom) {
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
        this.classificacao = classificacao;
        this.usaCupom = usaCupom;
    }

    public Long getId() {
        return id;
    }

}
