package org.tarea1;

/**
 * Excepción que maneja el caso en el que la moneda ingresada es nula
 */
public class PagoIncorrectoException extends Exception{
    /**
     * @param errorMessage Un mensaje especificando el problema
     */
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
