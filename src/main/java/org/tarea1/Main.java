package org.tarea1;

/**
 * Un proyecto que simula un expendedor donde se pueda comprar productos
 * (Bebidas, Dulces) con monedas.
 * @autor: Gabriel Castillo autor1
 * @autor: Marcos Martínez autor2
 * @version versión 1, 26 de abril del 2024

 */
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(7);
        Moneda m1 = null;
        Moneda m2 = null;
        Moneda m3 = null;
        Moneda m4 = null;
        Moneda m5 = null;
        try {
            m1 = new Moneda1000();
            Comprador c4 = new Comprador(m1, 5, exp);
            System.out.println(c4.queConsumiste() + ", " + c4.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        }

        try {
            Comprador c = new Comprador(m2, 4, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        }

        try {
            m3 = new Moneda500();
            Comprador c2 = new Comprador(m3, 1, exp);
            System.out.println(c2.queConsumiste() + ", " + c2.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
        Moneda moneda = exp.getVuelto();
        System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        }
        try {
            m4 = new Moneda1000();
            Comprador c4 = new Comprador(m4, 10, exp);
            System.out.println(c4.queConsumiste() + ", " + c4.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        }

        try {
            for (int i = 0; i <= 7; i++) {
                m5 = new Moneda1000();
                Comprador c3 = new Comprador(m5, 2, exp);
                System.out.println(c3.queConsumiste() + ", " + c3.cuantoVuelto());
            }

        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        }
    }
}
