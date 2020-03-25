package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

    public BedrijfsInventaris(String bedrijfsnaam, double budget){
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }
    public void schafAan(Goed g){
        if (g.huidigeWaarde() <= budget && !alleGoederen.contains(g)){
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }

    }
    public String toString(){
         String s =bedrijfsnaam+ "heeft de volgende goederen:\n ";
         for(Goed g: alleGoederen){
             s += g.toString()+"\n";
         }
         return s;
    }
}
