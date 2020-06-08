package br.maua.models;

import br.maua.enums.TipoDeMembros;

public class BigBrothers extends Membro{

    public BigBrothers(String nome, String email, TipoDeMembros funcao) {
        super(nome, email, funcao);
    }
    @Override
    public String mensagemRegular() {
        return "“Sempre ajudando as pessoas membros ou não S2!";
    }

    @Override
    public String mensagemExtra() {
        return "...";
    }
}
