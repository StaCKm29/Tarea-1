package org.tarea1;

/**
 * Moneda que representa una moneda de valor 100. Estas monedas serán utilizadas para el vuelto
 */
class Moneda100 extends Moneda{

    public Moneda100(){
        super();
    }

    /**
     * @return retorna un valor de 100
     */
    @Override
    public int getValor() {
        return 100;
    }

}
