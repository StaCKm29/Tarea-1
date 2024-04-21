package org.tarea1;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(7, 800);
        Moneda m = null;
        Comprador c = null;
        c = new Comprador(m, 100, exp);
    }
}
