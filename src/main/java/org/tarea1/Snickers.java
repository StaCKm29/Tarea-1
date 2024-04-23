package org.tarea1;

/**Cumple la función de representar un snickers */
public class Snickers extends Dulce {
    /**
     *
     * @param serie
     */
    public Snickers(int serie) {
        super(serie);
    }

    @Override
    /**
     *  @Return Retorna que se ha consumido un snickers
     *
     */
    public String consumir() {
        return "snickers";
    }
}
