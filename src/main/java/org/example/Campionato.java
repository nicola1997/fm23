package org.example;
import java.util.ArrayList;

public class Campionato {
    static int anno;
    private final String nome;
    ArrayList<Squadra> campionato;

    public Campionato(String nome, ArrayList<Squadra> campionato) {
        this.nome = nome;
        this.campionato = campionato;
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
        return campionato;
    }

    public void setCampionato(ArrayList<Squadra> campionato) {
        this.campionato = campionato;
    }

    @Override
    public String toString() {
        return "Campionato{" +
                "nome='" + nome + '\'' +
                ", campionato=" + campionato +
                '}';
    }
}
