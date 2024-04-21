package org.tarea1;

import java.util.ArrayList;

public class DepositoM {
    private ArrayList<Moneda> var;

    public DepositoM(){
        var = new ArrayList<>();
    }

    /**
     * @param m moneda ingresada por el usuario en el metodo comprarBebida de Expendedor
     */
    public void addMoneda(Moneda m){
        var.add(m);
    }

    /**
     * @return si el arreglo esta vacio, retorna nada. Si no, retorna la primera moneda
     */
    public Moneda getMoneda(){
        if(var.size() == 0){
            return null;
        }else{
            return var.remove(0);
        }
    }
}
