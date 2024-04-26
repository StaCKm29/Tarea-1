package org.tarea1;

/**
 * Cumple la función de representar una Sprite
 */
public class Sprite extends  Bebida{
    /**
     * @param serie serie del producto
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna que se ha consumido una sprite
     */
    @Override
    public String consumir(){
        return "Sprite";
    }
}
