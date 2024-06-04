package projeto_api.domain.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity(name = "tb-user")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcionalidade> funcionalidades;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
