package org.tarea1;

/**
 * Excepción que maneja el caso en que no esté el producto solicitado en la expendedora
 */
public class NoHayProductoException extends Exception{
    /**
     * @param errorMessage Un mensaje especificando el problema
     */
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
    }
}
