import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Campionato {
    static int anno;
    private final String nome;
    ArrayList<Squadra> squadre;
    Random r ;
    public Campionato(String nome, ArrayList<Squadra> squadre) {
        this.nome = nome;
        this.squadre = squadre;
        this.anno=2023;
        r= new Random();
    }
    void stagioneSuccessiva() {
        setAnno(getAnno() + 1);
        for (int i = 0; i < getCampionato().size(); i++) {
            getCampionato().get(i).azzera();
            getCampionato().get(i).updateValore();

            for (int j = 0; j < getCampionato().get(i).getCalciatori().size(); j++) {
                getCampionato().get(i).getCalciatore(j).invecchia();
                if(getCampionato().get(i).getCalciatore(j).getEta()>40){
                    System.out.println(getCampionato().get(i).getCalciatore(j).getCognome()+" ritirato! del "+getCampionato().get(i).getCalciatore(j).getSquadra()
                    +" "+getCampionato().get(i).getCalciatore(j).getSquadra()+" ha "+getCampionato().get(i).getCalciatori().size()+" giocatori\n" );
                    getCampionato().get(i).rimuoviGiocatore(getCampionato().get(i).getCalciatore(j));
                    getCampionato().get(i).aggiungiGiocatore(new Calciatore());



                }
            }
        }
    }

    ArrayList<Squadra> getSquadre() {
        return squadre;
    }

    public void setSquadre(ArrayList<Squadra> squadre) {
        this.squadre = squadre;
    }


    void sort() {
        Collections.sort(squadre,new ConfrontaPerPunti());
    }
    class ConfrontaPerPunti implements Comparator<Squadra> {
        public int compare(Squadra s1, Squadra s2) {
            return Integer.compare(s1.getPunti(), s2.getPunti());
        }
    }

    public void match(Squadra a,Squadra b){
        int i;
        int j;
        int gol=r.nextInt(5);
        int golA=0;
        int golB=0;
        while(gol>0){
            i=r.nextInt(a.getCalciatori().size());
            j=r.nextInt(b.getCalciatori().size());

            if(a.getCalciatore(i).getAbilita()>=b.getCalciatore(j).getAbilita()){
                a.getCalciatore(i).setGol(a.getCalciatore(i).getGol()+1);
                golA++;
        }
            else if (a.getCalciatore(i).getAbilita()<b.getCalciatore(j).getAbilita()){
                b.getCalciatore(j).setGol(b.getCalciatore(j).getGol()+1);
                golB++;
            }
            gol--;
        }
        if(golA>golB){
            a.setPunti(a.getPunti()+3);
            a.setVittorie(a.getVittorie()+1);
            b.setSconfitte(b.getSconfitte()+1);
        }
        else if(golA<golB){
            b.setPunti(b.getPunti()+3);
            b.setVittorie(b.getVittorie()+1);
            a.setSconfitte(a.getSconfitte()+1);
        }
        else {
            a.setPunti(a.getPunti()+1);
            b.setPunti(b.getPunti()+1);
            a.setPareggi(a.getPareggi()+1);
            b.setPareggi(b.getPareggi()+1);
        }
        a.setPartite(a.getPartite()+1);
        b.setPartite(b.getPartite()+1);

            //System.out.println(a.getNome()+"-"+b.getNome()+" "+golA+"-"+golB);

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
                ", squadre=" + squadre +
                '}';
    }
}
