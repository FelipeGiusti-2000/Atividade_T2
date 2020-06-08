package br.maua.models;

import br.maua.enums.TipoDeMembros;

public class ScriptGuys extends Membro{
    public ScriptGuys(String nome, String email, TipoDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String mensagemRegular() {
        return "Prazer em ajudar novos amigos de código!";
    }

    @Override
    public String mensagemExtra() {
        return "QU3Ro_S3us_r3curs0s.py";
    }
}
