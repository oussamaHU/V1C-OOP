package practicum7;

import practicum5.Leerling;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<>();


    public StringProcessor(){

    }

    public String verwerk(String input){
        for(OpmaakProces processen: processen){
            input = processen.maakOp(input);

        }
        return input;

    }
    public void voegProcesToe(OpmaakProces proces){
        if(!processen.contains(proces)){
            processen.add(proces);

        }

    }
}
