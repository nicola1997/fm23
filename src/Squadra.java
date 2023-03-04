import java.util.ArrayList;

public class Squadra {
    private final String nome;
    private int punti;
    private int partite;
    private int vittorie;
    private int pareggi;
    private int sconfitte;
    private ArrayList<Calciatore> calciatori;
    private int valore;


    public Squadra(String nome) {
        this.nome = nome;
        this.punti=0;
        this.calciatori = new ArrayList<Calciatore>();
        for(int i=0;i<20;i++){
            calciatori.add(new Calciatore());
            calciatori.get(i).setSquadra(getNome());
        }
        for(int i=0;i<calciatori.size();i++){
            this.valore=valore+getCalciatore(i).getPrezzo();
        }

    }

    public void aggiungiGiocatore(Calciatore giocatore) {
        calciatori.add(giocatore);
    }

    public void rimuoviGiocatore(Calciatore giocatore) {
        calciatori.remove(giocatore);
    }
    public void azzera(){
        punti=0;
        vittorie=0;
        pareggi=0;
        sconfitte=0;
        partite=0;
    }

    public int getValore() {
        return valore;
    }
    public void updateValore() {
        valore=0;
        for(int i=0;i<calciatori.size();i++){
            this.valore=valore+getCalciatore(i).getPrezzo();
        }
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public ArrayList<Calciatore> getCalciatori() {
        return calciatori;
    }

    public void setCalciatori(ArrayList<Calciatore> calciatori) {
        this.calciatori = calciatori;
    }

    public int getPartite() {
        return partite;
    }

    public void setPartite(int partite) {
        this.partite = partite;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public int getPareggi() {
        return pareggi;
    }

    public void setPareggi(int pareggi) {
        this.pareggi = pareggi;
    }

    public int getSconfitte() {
        return sconfitte;
    }

    public void setSconfitte(int sconfitte) {
        this.sconfitte = sconfitte;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }
    public Calciatore getCalciatore(int i){
        return calciatori.get(i);
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
