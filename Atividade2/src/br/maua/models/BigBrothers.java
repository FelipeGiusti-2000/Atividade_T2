package br.maua.models;

import br.maua.enums.Horarios;
import br.maua.enums.TipoDeMembros;

/**
 * Membro BigBrother, são os membros gestores, responsavel por monitorar os outros membros
 * @author Felipe Felde Giusti, José Guilherme Martins dos santos - felipe.giusti2000@gmail.com , josegms2000@gmail.com
 * @since 08/06/2020
 * @version 1.0
 */

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
