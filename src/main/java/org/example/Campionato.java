package org.example;
import java.util.ArrayList;

public class Campionato {
    static int anno;
    private final String nome;
    ArrayList<Squadra> squadre;

    public Campionato(String nome, ArrayList<Squadra> squadre) {
        this.nome = nome;
        this.squadre = squadre;
    }

    public static int getAnno() {
        return anno;
    }

    public static void setAnno(int anno) {
        Campionato.anno = anno;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Squadra> getCampionato() {
        return squadre;
    }

    public void setCampionato(ArrayList<Squadra> campionato) {
        this.squadre = campionato;
    }

    @Override
    public String toString() {
        return "Campionato{" +
                "nome='" + nome + '\'' +
                ", campionato=" + squadre +
                '}';
    }
}
