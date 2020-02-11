package week1.les2;

public class Piloot {
        private String naam;
        private int vlieguren;
        private double salaris;

        public Piloot(String naam){
            this.naam = naam;
        }
        public void setSalaris(double salaris){
            this.salaris = salaris;
        }
        public void verhoogVliegurenMet(int vlieguren){
            this.vlieguren = vlieguren;
        }
        public int getVlieguren(){
            return vlieguren;
        }
        public double getSalaris(){
            return salaris;
        }
        public String toString(){
            String s = naam + " heeft " + vlieguren + " gemaakt en verdient " + salaris;
            return s;
        }
    }

