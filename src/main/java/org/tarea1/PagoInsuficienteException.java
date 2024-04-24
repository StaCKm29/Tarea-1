package org.tarea1;

public class PagoInsuficienteException extends Exception{
    /**
     * Excepción que maneja el caso en que el pago sea insuficiente
     * @param errorMessage Un mensaje especificando el problema
     */
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
