package org.tarea1;

/**
 * Cumple la función de representar un snickers
 */
public class Snickers extends Dulce {
    /**
     * @param serie serie del producto
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     *  @return Retorna que se ha consumido un snickers
     *
     */
    @Override
    public String consumir() {
        return "snickers";
    }
}
