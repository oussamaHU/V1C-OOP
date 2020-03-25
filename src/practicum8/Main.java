package practicum8;

public class Main {
    public static void main(String[] arg){
        BedrijfsInventaris b1 = new BedrijfsInventaris(" bedrijf ",50000);
        Computer C1 = new Computer(" Dell ", " 00:1B:44:11:3A:B7 ", 850.00, 2016);
        Computer C2 = new Computer(" Dell "," 00:1B:44:11:3A:B7 ",850.00,2016);
        Computer C3 = new Computer(" HP "," 00:3G:43:91:7C:R4 ",1099.95,2020);

        Fiets F1 = new Fiets(" Gazelle ",430.00,2005,18487488);
        Fiets F2 = new Fiets(" Gazelle ",430.00,2005,18487488);
        Fiets F3 = new Fiets(" Batavus ",150.79,2002,42154545);

        Auto A1 = new Auto(" Opel ", 1695.00, 2017,"zz-452-aa");
        Auto A2 = new Auto(" Opel ", 1695.00, 2017,"zz-452-aa");
        Auto A3 = new Auto(" Audi ", 6700.00, 2014,"kk-252-pa");

        b1.schafAan(C1);
        b1.schafAan(C2);
        b1.schafAan(C3);

        b1.schafAan(F1);
        b1.schafAan(F2);
        b1.schafAan(F3);

        b1.schafAan(A1);
        b1.schafAan(A2);
        b1.schafAan(A3);

        System.out.println(b1.toString());


    }
}
