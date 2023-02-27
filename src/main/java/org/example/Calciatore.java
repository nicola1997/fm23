package org.example;

import java.util.Random;

public class Calciatore {
    static final String nomi[]={"Nicola","Vito","Andrea","Aldo","Luca"};
    static final String cognomi[]={"Neri","Biasco","Guida","Verdi","Rossi"};
    Random r;
    private final String nome;
    private final String cognome;
    private int eta;
    private int presenze;
    private int gol;

    public Calciatore() {
        r= new Random();
        this.nome = nomi[r.nextInt(5)];
        this.cognome = cognomi[r.nextInt(5)];
        this.eta = r.nextInt(15,39);
        this.presenze = 0;
        this.gol = 0;
    }

    @Override
    public String toString() {
        return "\n"+"Calciatore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", presenze=" + presenze +
                ", gol=" + gol +
                '}';
    }

    public int getPresenze() {
        return presenze;
    }

    public void setPresenze(int presenze) {
        this.presenze = presenze;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }


    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta=eta;
    }
}
