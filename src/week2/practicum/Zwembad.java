package week2.practicum;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;


    public Zwembad(double breedte,double lengte, double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad(){

    }
    public double getBreedte(){
        return breedte;
    }
    public double getLengte(){
        return lengte;
    }
    public double getDiepte(){
        return diepte;
    }
    public void setBreedte(double breedte){
        this.breedte = breedte;
    }
    public void setLengte(double lengte){
        this.lengte = lengte;
    }
    public void setDiepte(double diepte){
        this.diepte = diepte;
    }
    public double inhoud(){
       return  diepte*lengte*breedte;
    }
    public String toString(){
        String s = " dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " diep ";
                return s;
    }

}
