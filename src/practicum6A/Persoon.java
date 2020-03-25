package practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();


    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (budget >= g.huidigeWaarde() && !mijnGames.contains(g)){
            mijnGames.add(g);
        budget = budget - g.huidigeWaarde();
        return true;
    }
    return false;
}



    public boolean verkoop(Game g, Persoon koper){
        if (mijnGames.contains(g) && !koper.mijnGames.contains(g) && koper.budget >= g.huidigeWaarde()){
            koper.mijnGames.add(g);
            koper.budget = koper.budget - g.huidigeWaarde();
            mijnGames.remove(g);
            budget = budget + g.huidigeWaarde();
            return true;
        }
        return false;

    }
    public Game zoekGameOpNaam(String gameNaam){
        for(Game game: mijnGames ){
            if (game.getNaam().equals(gameNaam)) {
                return game;
            }
        }
        return null;


    }


    public String toString() {
           String s  = naam + " heeft een budget van " + String.format("%.2f", budget) + " en bezit nu de volgende games: \n";
           for (Game g : mijnGames){
               s += g;
               }
           return s;
           }
    }

