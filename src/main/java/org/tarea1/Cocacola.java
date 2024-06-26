package org.tarea1;

/**
 * Cumple la función de representar una cocacola
 */
public class Cocacola extends Bebida{
    /**
     * @param serie
     */
    public Cocacola(int serie){
        super(serie);
    }

    /**
     * @return Retorna que se ha consumido una cocacola
     */
    @Override
    public String consumir(){
        return "CocaCola";
    }
}
