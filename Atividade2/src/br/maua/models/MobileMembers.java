package br.maua.models;

import br.maua.enums.TipoDeMembros;

public class MobileMembers extends Membro{

    public MobileMembers(String nome, String email, TipoDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String mensagemRegular() {
        return "Happy Coding!";
    }

    @Override
    public String mensagemExtra() {
        return "MAsK_S0c13ty";
    }
}
