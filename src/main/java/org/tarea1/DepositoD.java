package org.tarea1;
import java.util.ArrayList;
public class DepositoD {
    private ArrayList<Dulce> var;

    public DepositoD(){
        var = new ArrayList<>();
    }

    public void addDulce(Dulce d){
        var.add(d);
    }

    public Dulce getDulce(){
        if(var.size() == 0){
            return null;
        }else{
            return var.remove(0);
        }
    }
}
