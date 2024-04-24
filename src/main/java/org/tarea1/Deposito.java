package org.tarea1;
import java.util.ArrayList;

/**
 * Esta clase se utilizará para el almacenamiento de diferentes tipos de productos y monedas
 * @param <T> es para instanciar un depósito genérico, donde T será reemplazado por una clase de producto
 */
public class Deposito<T> {
    private ArrayList<T> almacen;

    public Deposito() {
        almacen = new ArrayList<T>();
    }

    /**
     * Añade un objeto tipo T al depósito
     * @param objeto será el tipo de objeto añadido al depósito
     */
    public void addObjeto(T objeto) {
        almacen.add(objeto);
    }

    /**
     * @return  Retornará un objeto del tipo del depósito instanciado
     */
    public T getObjeto() {
        if(almacen.isEmpty()){
            return null;
        }else{
            return almacen.remove(0);
        }
    }
}
