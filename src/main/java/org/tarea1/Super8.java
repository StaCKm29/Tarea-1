package org.tarea1;

public class Super8 extends Dulce{
    /**
     * Cumple la función de representar un Super8
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
