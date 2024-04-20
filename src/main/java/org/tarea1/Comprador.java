package org.tarea1;

public class Comprador {
    private String sonido;
    private int vuelto = 0;

    /**
     * Constructor
     * @param m
     * @param cualBebida 1 para cocacola, 2 para sprite
     * @param exp
     */
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b1 = exp.comprarBebida(m, cualBebida);

        while (true) {
            Moneda a = exp.getVuelto();
            if (a == null) {
                break;
            } else {
                vuelto += a.getValor();
            }
        }

        if (b1 != null) {
            sonido = b1.beber();
        }else{
            sonido = null;
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }

}
