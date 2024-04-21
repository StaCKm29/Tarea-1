package org.tarea1;

import java.util.ArrayList;

public class DepositoB {
    private ArrayList<Bebida> var;

    public DepositoB(){
        var = new ArrayList<>();
    }
    public void addBebida(Bebida b){
        var.add(b);
    }
    public Bebida getBebida(){
        if(var.size() == 0){
            return null;
        }else{
            return var.remove(0);
        }
    }
}
