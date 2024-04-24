package org.tarea1;

public class Snickers extends Dulce {
    /**
     *Cumple la función de representar un snickers
     * @param serie serie del producto
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     *  @Return Retorna que se ha consumido un snickers
     *
     */
    @Override
    public String consumir() {
        return "snickers";
    }
}
