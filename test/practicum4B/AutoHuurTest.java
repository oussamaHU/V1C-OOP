package practicum4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    @Test

    public void autohuur(){
        AutoHuur a1 = new AutoHuur();
        assertEquals(" er is geen auto bekend\n" +
                " er is geen huurder bekend\n" +
                " aantal dagen: 0 en dat kost 0.0", a1.toString());
    }

    @Test
    public void geenHuurderwelAuto(){
        AutoHuur ah1 = new AutoHuur();

        Auto a2 = new Auto("Ferrari", 3500);
        ah1.setGehuurdeAuto(a2);

        ah1.toString();
        assertEquals(" autotype: Ferrari met prijs per dag: 3500.0\n" +
                " op naam van: null\n" +
                " aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }
    @Test
    public void welHuurdergeenAuto(){
        Klant k = new Klant("Mijnheer de Vries");

        AutoHuur ah1 = new AutoHuur();
        ah1.setHuurder(k);

        ah1.toString();

        assertEquals(" er is geen auto bekend\n" +
                " op naam van: op naam van Mijnheer de Vries (korting: 0.0)\n" +
                " aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void welHuurderwelAuto(){
        Klant k = new Klant("Mijnheer de Vries");

        AutoHuur ah1 = new AutoHuur();
        ah1.setHuurder(k);

        Auto a2 = new Auto("Ferrari", 3500);
        ah1.setGehuurdeAuto(a2);
        ah1.setAantalDagen(5);

        ah1.toString();
        assertEquals(" autotype: Ferrari met prijs per dag: 3500.0\n" +
                " op naam van: op naam van Mijnheer de Vries (korting: 0.0)\n" +
                " aantal dagen: 5 en dat kost 17500.0", ah1.toString());




    }

}