package org.tarea1;

/**
 * Un proyecto que simula una venta a través de un expendedor de dulces y bebidas, mediante un comprador el cual maneja monedas para comprar
 * diversos productos.
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
        /**
         * Se intenta comprar un producto con una moneda especificando qué producto y el expendedor
         * En caso que la moneda no se haya instanciado correctamente, entra en el primer catch.
         * En caso que no haya stock o que el producto no exista, se entra en el segundo catch.
         * En caso que la moneda sea insuficiente para pagar el producto deseado, se entra en el tercer catch.
         * La metodología es análoga para los demás try.
         */
        //Caso donde se instancia correctamente. Retorna un vuelto
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

        //Caso donde se intenta comprar con una moneda nula
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

        //Caso donde el pago es insuficiente
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

        //Caso donde se intenta comprar un producto que no existe
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

        //Caso donde se compra hasta agotar stock
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
