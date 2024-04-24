package org.tarea1;

public class Fanta extends Bebida{
    /**
     * Cumple la función de representar una fanta
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
