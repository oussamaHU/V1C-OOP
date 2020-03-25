package practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar ){
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }
    public double huidigeWaarde(){
        return aanschafPrijs*Math.pow(0.6, LocalDate.now().getYear()-productieJaar);


    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if(obj instanceof Computer){
            Computer anderePc = (Computer) obj;
            if(this.type.equals(anderePc.type)&& this.macAdres.equals(anderePc.macAdres)&&
                    this.aanschafPrijs == anderePc.aanschafPrijs && this.productieJaar == anderePc.productieJaar){
                gelijkeObjecten = true;
            }


        }
        return gelijkeObjecten;

    }
    public String toString(){
        String s = " een laptop van het type " + type + " met het macadres "+ macAdres + " en een aanschafprijs van €" +String.format("%.2f", aanschafPrijs) + " en het productiejaar is "+ productieJaar;
        return s;

    }
}
