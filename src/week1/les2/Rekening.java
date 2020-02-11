package week1.les2;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nummer){
        this.nummer = nummer;
        this.saldo = 0;
    }
    public int getNummer(){
        return nummer;
    }
    public double getSaldo(){
        return saldo;
    }
    public void stort(double bedrag){
        if (bedrag > 0){
            saldo = bedrag + saldo;
        }

    }
    public void neemOp(double bedrag){
        saldo -= bedrag;
    }
    public String toString(){
        String resultaat = "op rekening" + nummer + "staat" + saldo;
        return resultaat;
    }
}
