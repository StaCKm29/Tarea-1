package org.tarea1;

public enum Selector {
    COCACOLA(1),
    SPRITE(2),
    FANTA(3),
    SNICKERS(4),
    SUPER8(5);
    private final int posicion;
    Selector(int posicion) {
        this.posicion = posicion;
    }
    public int getPosicion(){
        return posicion;
    }

    public static Selector fromPosicion(int posicion){
        for(Selector producto : Selector.values() ){
            if(producto.getPosicion() == posicion){
                return producto;
            }
        }
        return null;
    }
}
