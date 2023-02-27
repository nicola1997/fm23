package org.example;

public class Calciatore implements Persona{
    private String nome;
    private String cognome;
    private int eta;
    private int presenze;
    private int gol;

    public Calciatore(String nome, String cognome, int eta, int presenze, int gol) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.presenze = presenze;
        this.gol = gol;
    }

    @Override
    public String toString() {
        return "Calciatore{" +
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


    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome=nome;
    }

    @Override
    public String getCognome() {
        return this.cognome;
    }

    @Override
    public void setCognome(String cognome) {
        this.cognome=cognome;
    }

    @Override
    public int getEta() {
        return this.eta;
    }

    @Override
    public void setEta(int eta) {
        this.eta=eta;
    }
}
