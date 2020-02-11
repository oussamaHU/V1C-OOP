package practicum2b;

import java.util.SplittableRandom;

public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private String naam;


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public Voetbalclub(String naam){
        this.naam = naam;
    }

    public void setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
    }

    public void setAantalVerloren(int aantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }

    public void setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
    }
    public String getNaam(){
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }
    public int aantalPunten(){
        return aantalGewonnen*3+aantalGelijk*1;

    }
    public int aantalGespeeld(){
        return aantalGewonnen+aantalGelijk+aantalVerloren;
    }


    public String toString() {
        String s = naam +" " + aantalGespeeld()+ " " + aantalGewonnen+ " " + aantalGelijk+  " " + aantalVerloren +" " + aantalPunten();
                return s;
    }
}

