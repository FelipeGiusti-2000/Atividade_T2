package br.maua.models;

import br.maua.enums.Horarios;
import br.maua.enums.TipoDeMembros;
import br.maua.interfaces.Apresentacao;
import br.maua.interfaces.PostarMensagem;

/**
 * Membro mae que se extende a todos os membros filhos.
 * @author Felipe Felde Giusti, José Guilherme Martins dos santos - felipe.giusti2000@gmail.com , josegms2000@gmail.com
 * @since 08/06/2020
 * @version 1.0
 */

public abstract class Membro implements PostarMensagem, Apresentacao {
    private String nome;
    private String email;
    private TipoDeMembros funcao;

    public Membro(String nome, String email, TipoDeMembros funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

}
