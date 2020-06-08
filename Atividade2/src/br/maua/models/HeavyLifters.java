package br.maua.models;

import br.maua.enums.Horarios;
import br.maua.enums.TipoDeMembros;

public class HeavyLifters extends Membro{

    public HeavyLifters(String nome, String email, TipoDeMembros funcao) {
        super(nome, email, funcao);
    }
    @Override
    public String mensagemRegular() {
        return "Podem contar conosco!";
    }

    @Override
    public String mensagemExtra() {
        return "N00b_qu3_n_Se_r3pita.bat";
    }
}
