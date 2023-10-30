package act5p2;

public class CajaDeTeConSms extends BaseDecoratorCajaDeTe {

    private final String num;

    public CajaDeTeConSms(CajaDeTe cajaDeTe, String num) {
        super(cajaDeTe);
        this.num = num;
    }

    @Override
    public int imprimeContenido() {
        int tmp =  super.imprimeContenido();
        enviaSms();
        return tmp;
    }

    private void enviaSms() {
        System.out.println(" * Envia SMS de notificación a " + num);
    }
}
