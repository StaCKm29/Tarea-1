package org.tarea1;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private DepositoB coca;
    private DepositoB sprite;
    private DepositoM monVu;
    private int precioBebida;

    /**
     * @param numBebidas cantidad de bebidas a crear por cada tipo
     * @param precioBebidas
     */
    public Expendedor(int numBebidas, int precioBebidas){
        sprite = new DepositoB();
        coca = new DepositoB();
        monVu = new DepositoM();
        this.precioBebida = precioBebidas;
        for(int i = 0; i < numBebidas; i++){
            Bebida b1 = new CocaCola(100+i);
            Bebida b2 = new Sprite(200+i);

            coca.addBebida(b1);
            sprite.addBebida(b2);
        }
    }
    /**
     *
     * @param m una moneda, la cual se debe evaluar si existe o es null
     * @param cual tipo de bebida (1 o 2), de lo contrario retorna null
     * @return retorna el tipo de bebida, siempre y cuando los parametros esten bien
     */
    public Bebida comprarBebida(Moneda m, int cual){
        Bebida b = null;
        if (m == null){
            return null;
        }else {
            if((cual == COCA) || (cual == SPRITE)) {
                if (precioBebida > m.getValor()) {
                    monVu.addMoneda(m);
                    return null;
                } else if (precioBebida == m.getValor()) {
                    if (cual == COCA) {
                        b = coca.getBebida();
                    } else if (cual == SPRITE) {
                        b = sprite.getBebida();
                    }
                    if (b == null) {
                        monVu.addMoneda(m);
                        return b;
                    }
                    return b;
                } else {
                    if (cual == COCA) {
                        b = coca.getBebida();
                    } else if (cual == SPRITE) {
                        b = sprite.getBebida();
                    }
                    if (b == null) {
                        monVu.addMoneda(m);
                        return b;
                    }

                    int n = (m.getValor() - precioBebida) / 100;
                    for (int i = 0; i < n; i++) {
                        monVu.addMoneda(new Moneda100());
                    }
                    return b;

                }
            }else{
                monVu.addMoneda(m);
                return null;
            }
        }
    }
    /**
     * @return retorna una moneda del deposito de monedas.
     */
    public Moneda getVuelto(){
        Moneda m = monVu.getMoneda();
        return m;
    }
}
