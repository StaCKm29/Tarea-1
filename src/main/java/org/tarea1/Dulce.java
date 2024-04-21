package org.tarea1;

abstract class Dulce {
    private int serie;

    /**
     * @param serie numero de serie de un dulce
     */
    public Dulce(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String comer();
}
