package org.tarea1;

public class Main {
    public static void main(String[] args){
        try {
            Expendedor exp = new Expendedor(7);
            Moneda m = null;
            Comprador c = null;
            c = new Comprador(m, 4, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }catch (NoHayProductoException e){
            System.out.println("No hay producto");
    }
}
