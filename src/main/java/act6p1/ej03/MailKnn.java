package act6p1.ej03;

public class MailKnn extends GenericKnn{
    MailKnn(int n) {
        super(n);
    }

    @Override
    void preparaDatos() {
        System.out.println("Consigue los datos de la fuente de MAILS");
    }

    @Override
    void calculaDistancias() {
        System.out.println("Calcula la distancia entre MAILS");
    }
}
