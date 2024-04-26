package org.tarea1;

/**
 * Cumple la función de representar un Super8
 */
public class Super8 extends Dulce{
    /**
     * @param serie
     */
    public Super8(int serie) {
        super(serie);
    }

    /**
     * Retorna que se ha consumido un super8
     */
    @Override
    public String consumir() {
        return "super8";
    }
}
