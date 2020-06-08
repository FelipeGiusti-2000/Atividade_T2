package br.maua.models;

import br.maua.enums.Horarios;
import br.maua.enums.TipoDeMembros;

/**
 * Membro Mobile Members é um membro que é extendido do Membro "mãe"
 * @author Felipe Felde Giusti, José Guilherme Martins dos santos - felipe.giusti2000@gmail.com , josegms2000@gmail.com
 * @since 08/06/2020
 * @version 1.0
 */

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
    public String mensagem(Sistema sistema, String mensagemRegular, String mensagemExtra){
        if(sistema.getHorario().equals(Horarios.REGULAR)){
            return mensagemRegular;
        }
        else{
            return mensagemExtra;
        }
    }
}
