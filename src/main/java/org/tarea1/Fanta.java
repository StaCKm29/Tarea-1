package org.tarea1;

/**
 * Cumple la función de representar una fanta
 */
public class Fanta extends Bebida{
    /**
     * @param serie, representa el número de serie de la fanta
     */
    public Fanta(int serie){
        super(serie);
    }

    /**
     * @return retorna que se ha consumido una fanta
     */
    @Override
    public String consumir(){
        return "Fanta";
    }
}
