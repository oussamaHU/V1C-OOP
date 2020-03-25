package practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;

    }

    public double huidigeWaarde() {
        return nieuwprijs*Math.pow(0.7, LocalDate.now().getYear()-bouwjaar);

    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if(obj instanceof Auto){
            Auto andereAuto = (Auto) obj;
            if(this.kenteken.equals(andereAuto.kenteken)&& super.equals(andereAuto)){
                gelijkeObjecten = true;
            }


        }
        return gelijkeObjecten;

    }
}
