package projeto_api_2.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @Column( scale = 2, precision = 10)
    private BigDecimal limite;

    public Cartao() {
    }

    public Cartao(String numero, BigDecimal limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

}
