package org.tarea1;

public class Main {
    public static void main(String[] args){
        Expendedor exp = new Expendedor(7);
        Moneda m = new Moneda500();
        try {
            Comprador c = new Comprador(m, 4, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        }catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
    }
}
