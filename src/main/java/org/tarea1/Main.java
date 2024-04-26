package org.tarea1;

import javax.swing.*;

/**
 * Un proyecto que simula una venta a través de un expendedor de dulces y bebidas, mediante un comprador el cual maneja monedas para comprar
 * diversos productos.
 * @author Gabriel Castillo autor1
 * @author Marcos Martínez autor2
 * @version versión 1, 26 de abril del 2024

 */
public class Main {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos en stock para el expendedor"));
        Expendedor exp = new Expendedor(cantidad);
        JOptionPane.showMessageDialog(null, "Bienvenido al Expendedor de dulces y bebidas.\n"
        + "A continuación se mostrarán los productos: \n"
        + "1.Cocacola $1000\n"+"2.Sprite $1000\n"+"3.Fanta $1000\n"+"4.Snickers $800\n"+"5.Super8 $300\n");
        Moneda m1 = null;
        Moneda m5 = null;
        /**
         * Se intenta comprar un producto con una moneda especificando qué producto y el expendedor
         * En caso que la moneda no se haya instanciado correctamente, entra en el primer catch.
         * En caso que no haya stock o que el producto no exista, se entra en el segundo catch.
         * En caso que la moneda sea insuficiente para pagar el producto deseado, se entra en el tercer catch.
         */

        try {
            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del producto que desea comprar"));
            JOptionPane.showMessageDialog(null, "Monedas disponibles: 1000, 500, 100\n");
            int tipoMoneda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de moneda que desea utilizar\n"));
            if(tipoMoneda == 1000){
                m1 = new Moneda1000();
            }else if(tipoMoneda == 500) {
                m1 = new Moneda500();
            } else if (tipoMoneda == 100) {
                m1 = new Moneda100();
            }
            Comprador c4 = new Comprador(m1, eleccion, exp);
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
            for (int i = 0; i <= cantidad; i++) {
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
