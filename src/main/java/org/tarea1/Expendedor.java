package org.tarea1;

/**
 * Se encarga de representar un expendedor de Dulces y Bebidas el cual posee distintos depósitos destinados al almacenamiento de cada producto
 * y un depósito destinado a las monedas del vuelto
 */

public class Expendedor {

    private Deposito <Producto> coca;
    private Deposito <Producto> sprite;
    private Deposito <Moneda> coin;
    private Deposito <Producto> fanta;
    private Deposito <Producto> snickers;
    private Deposito <Producto> super8;
    private int precioBebida;

    /**
     * El método constructor se encargará de recibir la cantidad de stock deseado para cada producto, y llenará los depósitos con la cantidad requerida
     * @param numProductos Es la cantidad de cada producto que habrán inicialmente en el expendedor
     */

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
     * @param cual Se usa para la elección del producto deseado, 1 para cocacola, 2 para sprite, 3 para fanta, 4 para snickers y 5 para super8
     * @return retorna el producto deseado
     */
    public Producto comprarProducto(Moneda m, int cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException{
        Producto b = null;
        if (m == null){
            throw new PagoIncorrectoException("Debe instanciar en algun valor la moneda (moneda null).\n");
        }else {
            Selector producto = Selector.fromPosicion(cual); 
            switch (producto){
                /**
                 * En caso que el producto seleccionado sea una cocacola, primero se validará que la cantidad de dinero sea suficiente para pagar el
                 * producto, luego se verificará que exista stock del mismo. Una vez pasados estos filtros se calcula el vuelto en monedas de a 100 y se
                 * llena el depósito de vuelto con la cantidad necesaria, y finalmente se entrega la cocacola. Esto es análogo para los demás productos
                 */
                case COCACOLA:
                    if(producto.COCACOLA.getPrecio() > m.getValor()){
                        coin.addObjeto(m);
                         throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                    } else if (producto.COCACOLA.getPrecio() == m.getValor()){
                        b = coca.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
                        }
                        return b;
                    } else {
                        b = coca.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
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
                        throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                    } else if (Selector.SPRITE.getPrecio() == m.getValor()){
                        b = sprite.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
                        }
                        return b;
                    } else {
                        b = sprite.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
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
                        throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                    } else if (producto.FANTA.getPrecio() == m.getValor()){
                        b = fanta.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
                        }
                        return b;
                    } else {
                        b = fanta.getObjeto();
                        if (b == null) {
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
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
                        throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                    } else if (producto.SNICKERS.getPrecio() == m.getValor()){
                        b = snickers.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
                        }
                        return b;
                    } else {
                        b = snickers.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
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
                        throw new PagoInsuficienteException("El pago es insuficiente para comprar el producto.\n");
                    } else if (producto.SUPER8.getPrecio() == m.getValor()){
                        b = super8.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
                        }
                        return b;
                    } else {
                        b = super8.getObjeto();
                        if(b == null){
                            coin.addObjeto(m);
                            throw new NoHayProductoException("No hay producto en el deposito.\n");
                        }
                        int n = (m.getValor() - producto.getPrecio()) / 100;
                        for(int i = 0; i < n; i++){
                            coin.addObjeto(new Moneda100());
                        }
                        return b;
                    }
                default:
                    coin.addObjeto(m);
                    throw new NoHayProductoException("No hay producto en el deposito.\n");
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
