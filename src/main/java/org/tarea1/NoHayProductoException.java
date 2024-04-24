package org.tarea1;


public class NoHayProductoException extends Exception{
    /**
     * Excepción que maneja el caso en que no esté el producto solicitado en la expendedora
     * @param errorMessage Un mensaje especificando el problema
     */
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
    }
}
