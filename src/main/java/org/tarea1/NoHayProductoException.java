package org.tarea1;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
    }
}
