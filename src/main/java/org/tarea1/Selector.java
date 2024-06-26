package org.tarea1;

/**
 * Selector servirá para la elección de productos al momento de la compra, y a su vez para designar los precios individuales de cada producto
 */
public enum Selector {

    COCACOLA(1, 1000),
    SPRITE(2, 1000),
    FANTA(3, 1000),
    SNICKERS(4, 800),
    SUPER8(5, 300);
    private final int posicion;
    private final int precio;

    /**
     * @param posicion Número asociado a cada producto
     * @param precio El precio del producto
     */
    Selector(int posicion, int precio) {
        this.posicion = posicion;
        this.precio = precio;
    }

    /**
     *
     * @return Se retorna el número asociado a cada producto
     */
    public int getPosicion(){
        return posicion;
    }

    /**
     *
     * @return Se retorna el precio del producto
     */
    public int getPrecio(){
        return precio;
    }

    /**
     * Para saber el nombre del producto acorde a su posición
     * @param posicion
     * @return Retorna el nombre de la constante
     */
    public static Selector fromPosicion(int posicion){
        for(Selector producto : Selector.values() ){
            if(producto.getPosicion() == posicion){
                return producto;
            }
        }
        return null;
    }
}
