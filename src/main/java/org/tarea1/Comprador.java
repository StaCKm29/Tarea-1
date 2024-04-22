package org.tarea1;

public class Comprador {
    private String sonido;
    private int vuelto = 0;

    /**
     * Constructor
     * @param m
     * @param cualProducto 1 para cocacola, 2 para sprite
     * @param exp
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto b1 = exp.comprarProducto(m, cualProducto);

        while (true) {
            Moneda a = exp.getVuelto();
            if (a == null) {
                break;
            } else {
                vuelto += a.getValor();
            }
        }

        if (b1 != null) {
            sonido = b1.consumir();
        }else{
            sonido = null;
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }

}
