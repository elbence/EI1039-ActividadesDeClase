package act5p2;

public class CajaDeTeConMail extends BaseDecoratorCajaDeTe {

    private final String mail;

    public CajaDeTeConMail(CajaDeTe cajaDeTe, String mail) {
        super(cajaDeTe);
        this.mail = mail;
    }

    @Override
    public int imprimeContenido() {
        int tmp = super.imprimeContenido();
        enviaMail();
        return tmp;
    }

    public void enviaMail() {
        System.out.println(" * Envia mail de notificación a " + mail);
    }
}
