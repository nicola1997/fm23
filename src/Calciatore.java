import java.util.Random;

public class Calciatore {
    static final String nomi[]={"Nicola","Vito","Andrea","Aldo","Luca","Alessandro","Alessio","Biagio","Carlo","Daniele","Domenico"};
    static final String cognomi[]={"Neri","Biasco","Guida","Verdi","Rossi","Toldo","Aroli","Apaci","Dipinto","Bianchi","Amato"};
    Random r;
    private final String nome;
    private final String cognome;
    private int eta;
    private int gol;
    private int abilita;
    private String squadra;
    int prezzo;
    int incremento;


    public Calciatore() {
        r= new Random();
        this.nome = nomi[r.nextInt(nomi.length)];
        this.cognome = cognomi[r.nextInt(cognomi.length)];
        this.eta = r.nextInt(15,39);
        this.gol = 0;
        this.abilita=r.nextInt(50,99);
        this.squadra="svincolato";
        if(eta>14&&eta<22) {
            incremento=r.nextInt(1,3);
            setAbilita(getAbilita()+incremento);
        }
        if(eta>26) {
            incremento=r.nextInt(1,3);
            setAbilita(getAbilita()-r.nextInt(incremento));
        }
        this.prezzo=1000*abilita-eta*500;

    }

    public void invecchia(){
        setEta(getEta()+1);

        if(eta>14&&eta<22) {
            incremento=r.nextInt(1,3);
            setAbilita(getAbilita()+incremento);
        }
        if(eta>26) {
            incremento=r.nextInt(1,3);
            setAbilita(getAbilita()-(incremento));
        }


        setPrezzo(1000*abilita-eta*500);

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
        return

                "  \neta=" + eta +
                " gol=" + gol +
                " abilita=" + abilita +
                " prezzo=" + prezzo +
                " squadra='" + squadra + '\'' +
                " nome='" + nome + '\'' +
                " cognome='" + cognome + '\'' ;
    }
}
