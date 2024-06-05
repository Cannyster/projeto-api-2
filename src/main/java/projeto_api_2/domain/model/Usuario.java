package projeto_api_2.domain.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne
    private Conta conta;

    @OneToOne
    private Cartao cartao;

    @OneToMany
    private List<Funcionalidade> funcionalidades;

    @OneToMany
    private List<Novidade> novidades;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public List<Funcionalidade> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(List<Funcionalidade> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public List<Novidade> getNovidades() {
        return novidades;
    }

    public void setNovidades(List<Novidade> novidades) {
        this.novidades = novidades;
    }
}
