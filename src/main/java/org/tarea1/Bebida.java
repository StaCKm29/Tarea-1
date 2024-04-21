package org.tarea1;

abstract class Bebida extends Producto {
    /**
     * @param serie numero de serie de una bebida
     */
    public Bebida(int serie){
        super(serie);
    }

    public abstract String beber();
}
