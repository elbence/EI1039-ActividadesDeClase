package act6p1;

public class SatImageKnn extends GenericKnn{
    SatImageKnn(int n) {
        super(n);
    }

    @Override
    void preparaDatos() {
        System.out.println("Consigue los datos de la fuente de IMAGENES SATELITALES");
    }

    @Override
    void calculaDistancias() {
        System.out.println("Calcula la distancia entre IMAGENES SATELITALES");
    }
}
