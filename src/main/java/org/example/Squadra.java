package org.example;

import java.util.ArrayList;

public class Squadra {
    private final String nome;
    private int punti;
    private ArrayList<Calciatore> calciatori;

    public Squadra(String nome) {
        this.nome = nome;
        this.punti=0;
        this.calciatori = new ArrayList<Calciatore>();
        for(int i=0;i<20;i++){
            calciatori.add(new Calciatore());
            calciatori.get(i).setSquadra(getNome());
        }
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public void aggiungiGiocatore(Calciatore giocatore) {
        calciatori.add(giocatore);
    }

    public void rimuoviGiocatore(Calciatore giocatore) {
        calciatori.remove(giocatore);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", punti=" + punti +
                ", calciatori=" + calciatori +
                '}';
    }
}
