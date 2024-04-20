package org.tarea1;

abstract class Bebida {
    private int serie;

    /**
     * @param serie numero de serie de una bebida
     */
    public Bebida(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String beber();
}
