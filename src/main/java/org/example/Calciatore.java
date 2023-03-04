package org.example;

import java.util.Random;

public class Calciatore {
    static final String nomi[]={"Nicola","Vito","Andrea","Aldo","Luca"};
    static final String cognomi[]={"Neri","Biasco","Guida","Verdi","Rossi","Toldo","Aroli"};
    Random r;
    private final String nome;
    private final String cognome;
    private int eta;
    private int gol;
    private int abilita;
    private String squadra;
    private final int incremento;
    int prezzo;


    public Calciatore() {
        r= new Random();
        this.nome = nomi[r.nextInt(nomi.length)];
        this.cognome = cognomi[r.nextInt(cognomi.length)];
        this.eta = r.nextInt(15,39);
        this.gol = 0;
        this.abilita=r.nextInt(50,99);
        this.incremento=r.nextInt(1,3);
        this.prezzo=1000*abilita-eta*500;
        this.squadra="svincolato";

    }

    public void invecchia(){
        setEta(getEta()+1);
        if(eta<25){
            setAbilita(getAbilita()+getIncremento());
        }
        else if(eta>30){
            setAbilita(getAbilita()-1);
        }
        setPrezzo(1000*abilita-eta*500);

        }

    public int getIncremento() {
        return incremento;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public int getAbilita() {
        return abilita;
    }
    public void setAbilita(int abilita) {
        this.abilita = abilita;
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
    public String getSquadra() {
        return squadra;
    }
    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }
    @Override
    public String toString() {
        return "\nCalciatore{" +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", gol=" + gol +
                ", abilita=" + abilita +
                ", squadra='" + squadra + '\'' +
                ", incremento=" + incremento +
                ", prezzo=" + prezzo +
                '}';
    }
}
