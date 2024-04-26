package org.tarea1;

/**
 * Excepción que maneja el caso en que el pago sea insuficiente
 */
public class PagoInsuficienteException extends Exception{
    /**
     * @param errorMessage Un mensaje especificando el problema
     */
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
