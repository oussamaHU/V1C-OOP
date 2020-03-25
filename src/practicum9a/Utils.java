package practicum9a;

import java.text.NumberFormat;



public class Utils {
    private static int aantalKeer = 0;


    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314, 1));
        System.out.println("aantalkeer aangeroepen:" + getaantalKeer());
    }


        public static int getaantalKeer () {
            return aantalKeer;
        }

        public static String euroBedrag ( double bedrag){
        return euroBedrag(bedrag, 2);





        }


        public static String euroBedrag ( double bedrag, int precisie){
            aantalKeer += 1;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(precisie);
            String bedrag1 = nf.format(bedrag);
            return bedrag1;


        }


}
