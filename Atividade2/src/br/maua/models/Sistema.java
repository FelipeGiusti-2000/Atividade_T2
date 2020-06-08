package br.maua.models;

import br.maua.enums.Horarios;

import java.util.ArrayList;

public class Sistema {
    private Horarios horario;
    private ArrayList<Membro> membros;

    public Sistema(){
        this.horario = Horarios.REGULAR;
        this.membros = new ArrayList<>();
    }

    public Horarios getHorario() {
        return horario;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public void mudarHorario(Horarios horario) {
        if(horario.equals(Horarios.REGULAR)){
            this.horario = Horarios.EXTRA;
        }
        else this.horario = Horarios.REGULAR;
    }

    public void adicionarMembro(Membro membro){
        membros.add(membro);
    }
    public void removerMembro(Membro membro){
        //Remover membro
    }

}
