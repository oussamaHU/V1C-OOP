package practicum7;

public class KleinletterProces implements OpmaakProces {
    public KleinletterProces(){

    }
    public String maakOp(String input){
        String resultaat = input.toLowerCase();
        return resultaat;
    }
}
