package br.maua.models;

import br.maua.enums.Horarios;
import br.maua.enums.TipoDeMembros;

/**
 * Script Guys é um membro que é extendido do Membro "mãe"
 * @author Felipe Felde Giusti, José Guilherme Martins dos santos - felipe.giusti2000@gmail.com , josegms2000@gmail.com
 * @since 08/06/2020
 * @version 1.0
 */

public class ScriptGuys extends Membro{
    public ScriptGuys(String nome, String email, TipoDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String mensagemRegular() {
        return "Prazer em ajudar novos amigos de código!";
    }


    }
    public String mensagem(Sistema sistema){
        if(sistema.getHorario().equals(Horarios.REGULAR)){

        }
        else{
            @Override
            public String mensagemExtra() {
                return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
