package org.tarea1;

public class Expendedor {
    private Deposito <Producto> coca;
    private Deposito <Producto> sprite;
    private Deposito <Moneda> coin;
    private Deposito <Producto> fanta;
    private Deposito <Producto> snickers;
    private Deposito <Producto> super8;
    private int precioBebida;

    public Expendedor(int numProductos){
        fanta = new Deposito<Producto>();
        coca = new Deposito<Producto>();
        sprite = new Deposito<Producto>();
        coin = new Deposito<Moneda>();
        snickers = new Deposito<Producto>();
        super8 = new Deposito<Producto>();

        for(int i = 0; i < numProductos; i++){
            Bebida b1 = new Cocacola(100+i);
            Bebida b2 = new Sprite(200+i);
            Bebida b3 = new Fanta(300+i);
            Dulce d1 = new Snickers(400+i);
            Dulce d2 = new Super8(500+i);

            coca.addObjeto(b1);
            sprite.addObjeto(b2);
            fanta.addObjeto(b3);
            snickers.addObjeto(d1);
            super8.addObjeto(d2);
        }
    }
    /**
     *
     * @param m una moneda, la cual se debe evaluar si existe o es null
     * @param cual tipo de bebida (1 o 2), de lo contrario retorna null
     * @return retorna el tipo de bebida, siempre y cuando los parametros esten bien
     */
    public Producto comprarProducto(Moneda m, int cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException{
        Producto b = null;
        if (m == null){
            throw new PagoIncorrectoException("La moneda debe iniciarse con una clase con valor.\n Cambie el valor null de la moneda.");
        }else {
            Selector producto = Selector.fromPosicion(cual); 
            switch (producto){
                case COCACOLA:
                    if(producto.COCACOLA.getPrecio() > m.getValor()){
                        coin.addObjeto(m);
                        throw new PagoInsuficienteException("El valor del producto supera el valor de su moneda.\n Ingrese una moneda de mayo valor.");
                    } else if (producto.COCACOLA.getPrecio() == m.getValor()){
                        b = coca.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        return b;
                    } else {
                        b = coca.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        int n = (m.getValor() - producto.getPrecio()) / 100;
                        for(int i = 0; i < n; i++){
                            coin.addObjeto(new Moneda100());
                        }
                        return b;
                    }
                case SPRITE:
                    if(producto.SPRITE.getPrecio() > m.getValor()){
                        coin.addObjeto(m);
                        throw new PagoInsuficienteException("El valor del producto supera el valor de su moneda.\n Ingrese una moneda de mayo valor.");
                    } else if (Selector.SPRITE.getPrecio() == m.getValor()){
                        b = sprite.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        return b;
                    } else {
                        b = sprite.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        int n = (m.getValor() - producto.getPrecio()) / 100;
                        for(int i = 0; i < n; i++){
                            coin.addObjeto(new Moneda100());
                        }
                        return b;
                    }
                case FANTA:
                    if(producto.FANTA.getPrecio() > m.getValor()){
                        coin.addObjeto(m);
                        throw new PagoInsuficienteException("El valor del producto supera el valor de su moneda.\n Ingrese una moneda de mayo valor.");
                    } else if (producto.FANTA.getPrecio() == m.getValor()){
                        b = fanta.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        return b;
                    } else {
                        b = fanta.getObjeto();
                        if (b == null) {
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        int n = (m.getValor() - producto.getPrecio()) / 100;
                        for (int i = 0; i < n; i++) {
                            coin.addObjeto(new Moneda100());
                        }
                        return b;
                    }
                case SNICKERS:
                    if(producto.SNICKERS.getPrecio() > m.getValor()){
                        coin.addObjeto(m);
                        throw new PagoInsuficienteException("El valor del producto supera el valor de su moneda.\n Ingrese una moneda de mayo valor.");
                    } else if (producto.SNICKERS.getPrecio() == m.getValor()){
                        b = snickers.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        return b;
                    } else {
                        b = snickers.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        int n = (m.getValor() - producto.getPrecio()) / 100;
                        for(int i = 0; i < n; i++){
                            coin.addObjeto(new Moneda100());
                        }
                        return b;
                    }
                case SUPER8:
                    if(producto.SUPER8.getPrecio() > m.getValor()){
                        coin.addObjeto(m);
                        throw new PagoInsuficienteException("El valor del producto supera el valor de su moneda.\n Ingrese una moneda de mayo valor.");
                    } else if (producto.SUPER8.getPrecio() == m.getValor()){
                        b = super8.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        return b;
                    } else {
                        b = super8.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.");
                        }
                        int n = (m.getValor() - producto.getPrecio()) / 100;
                        for(int i = 0; i < n; i++){
                            coin.addObjeto(new Moneda100());
                        }
                        return b;
                    }
                default:
                    throw new NoHayProductoException("No hay producto en el deposito.");
            }
        }
    }
    /**
     * @return retorna una moneda del deposito de monedas.
     */
    public Moneda getVuelto(){
        Moneda m = coin.getObjeto();
        return m;
    }
}
