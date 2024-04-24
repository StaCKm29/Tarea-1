package org.tarea1;

public class Cocacola extends Bebida{
    /**
     *Cumple la función de representar una cocacola
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
