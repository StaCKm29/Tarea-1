package org.tarea1;

/**
 * Un proyecto que simula un expendedor donde se pueda comprar productos
 * (Bebidas, Dulces) con monedas.
 * @autor: Gabriel Castillo autor1
 * @autor: Marcos Martínez autor2
 * @version versión 1, 26 de abril del 2024

 */
public class Main {
    public static void main(String[] args){
        Expendedor exp = new Expendedor(7);
        Moneda m1 = null;
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        try {
            //Comprador c = new Comprador(m1, 4, exp);
            //Comprador c2 = new Comprador(m2, 1, exp);
            Comprador c4 = new Comprador(m3, 3, exp);
            /*for(int i = 0; i <= 7; i++) {
                Comprador c3 = new Comprador(m3, 2, exp);
                System.out.println(c3.queConsumiste() + ", " + c3.cuantoVuelto());
            }*/

            //System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
           // System.out.println(c2.queConsumiste() + ", " + c2.cuantoVuelto());
            System.out.println(c4.queConsumiste() + ", " + c4.cuantoVuelto());
        }catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        }catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
    }
}
