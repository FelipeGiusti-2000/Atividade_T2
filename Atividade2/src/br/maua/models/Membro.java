package br.maua.models;
import br.maua.enums.Horarios;
import br.maua.enums.TipoDeMembros;
import br.maua.interfaces.PostarMensagem;

public abstract class Membro implements PostarMensagem {
    private String nome;
    private String email;
    private TipoDeMembros funcao;

    public Membro(String nome, String email, TipoDeMembros funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }


}
