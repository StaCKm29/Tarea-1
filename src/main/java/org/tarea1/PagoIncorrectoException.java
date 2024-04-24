package org.tarea1;

public class PagoIncorrectoException extends Exception{
    /**
     * Excepción que maneja el caso en el que la moneda ingresada es nula
     * @param errorMessage Un mensaje especificando el problema
     */
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
