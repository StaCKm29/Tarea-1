package org.tarea1;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private Deposito <Bebida> coca;
    private Deposito <Bebida> sprite;
    private Deposito <Moneda> coin;
    private Deposito <Bebida> fanta;
    private Deposito <Dulce> snickers;
    private Deposito <Dulce> super8;
    private int precioBebida;

    /**
     * @param numBebidas cantidad de bebidas a crear por cada tipo
     * @param precioBebidas
     */
    public Expendedor(int numBebidas, int precioBebidas){
        fanta = new Deposito<Bebida>();
        coca = new Deposito<Bebida>();
        sprite = new Deposito<Bebida>();
        coin = new Deposito<Moneda>();
        snickers = new Deposito<Dulce>();
        super8 = new Deposito<Dulce>();

        this.precioBebida = precioBebidas;
        for(int i = 0; i < numBebidas; i++){
            Bebida b1 = new Cocacola(100+i);
            Bebida b2 = new Sprite(200+i);

            coca.addObjeto(b1);
            sprite.addObjeto(b2);
        }
    }
    /**
     *
     * @param m una moneda, la cual se debe evaluar si existe o es null
     * @param cual tipo de bebida (1 o 2), de lo contrario retorna null
     * @return retorna el tipo de bebida, siempre y cuando los parametros esten bien
     */
    public Producto comprarProducto(Moneda m, int cual){
        Producto b = null;
        if (m == null){
            return null;
        }else {
            Selector producto = Selector.fromPosicion(cual); 
            switch (producto){
                case COCACOLA:
                    break;
                case SPRITE:
                    break;
                case FANTA:
                    break;
                case SNICKERS:
                    break;
                case SUPER8:
                    break;
            }
            if((cual == Selector.COCACOLA.ordinal()) || (cual == Selector.SPRITE.ordinal()) || (cual == Selector.FANTA.ordinal())) {
                if (precioBebida > m.getValor()) {
                    coin.addObjeto(m);
                    return null;
                } else if (precioBebida == m.getValor()) {
                    if (cual == Selector.COCACOLA.ordinal()) {
                        b = coca.getObjeto();
                    } else if (cual == Selector.SPRITE.ordinal()) {
                        b = sprite.getObjeto();
                    }
                    else if( cual == Selector.FANTA.ordinal()){
                        b = fanta.getObjeto();
                    }
                    if (b == null) {
                        coin.addObjeto(m);
                        return b;
                    }
                    return b;
                } else {
                    if (cual == COCA) {
                        b = coca.getObjeto();
                    } else if (cual == SPRITE) {
                        b = sprite.getObjeto();
                    }
                    if (b == null) {
                        coin.addObjeto(m);
                        return b;
                    }

                    int n = (m.getValor() - precioBebida) / 100;
                    for (int i = 0; i < n; i++) {
                        coin.addObjeto(new Moneda100());
                    }
                    return b;

                }
            }else if(cual == Selector.SUPER8.ordinal() || cual ==Selector.SPRITE.ordinal()){

            }else{
                coin.addObjeto(m);
                return null;
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
