package org.tarea1;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
