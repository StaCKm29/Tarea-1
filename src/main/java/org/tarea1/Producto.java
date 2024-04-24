package org.tarea1;

abstract class Producto {
    private int serie;

    /**
     * Sirve como plantilla para representar a los productos que se venderán en el expendedor
     * @param serie Número que diferencia a cada producto
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     *
     * @return Retorna el número de serie de un producto
     */
    public int getSerie() {
        return serie;
    }

    /**
     *
     * @return Retorna qué producto se ha consumido
     */
    public abstract String consumir();
}
