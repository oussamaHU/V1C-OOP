package practicum5;


import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deleerlingen = new ArrayList<>();


    public Klas(String klascode) {
        this.klasCode = klascode;
    }

    public void voegLeerlingToe(Leerling l) {
        deleerlingen.add(l);

    }

    public void wijzigCijfer(String naam, double nwCijfer) {
        for (Leerling leerling : deleerlingen) {
            if (leerling.getNaam().equals(naam)) {
                leerling.setCijfer(nwCijfer);
            }


        }

    }

    public ArrayList<Leerling> getDeleerlingen() {
        return deleerlingen;
    }

    public int aantalLeerlingen() {
        return deleerlingen.size();

    }


    public String toString() {
        String s = " in Klas " + " klasCode " + klasCode + " zitten de volgende leerlingen \n";

            for (Leerling leerling : deleerlingen) {
                s += leerling;
            }
        return s;

    }


    }

