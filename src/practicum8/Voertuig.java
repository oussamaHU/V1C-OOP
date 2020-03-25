package practicum8;

abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar){
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;
        if(obj instanceof Voertuig){
            Voertuig andereVoertuig = (Voertuig) obj;
            if(this.type.equals(andereVoertuig.type)&& this.nieuwprijs == andereVoertuig.nieuwprijs &&
                    this.bouwjaar == andereVoertuig.bouwjaar){
                gelijkeObjecten = true;
            }


        }
        return gelijkeObjecten;

    }
    public String toString(){
        String s = " het voertuig van het type " + type + " met een nieuwprijs €" + String.format("%.2f", nieuwprijs) + " van het bouwjaar "+ bouwjaar;
        return s;

    }

}
