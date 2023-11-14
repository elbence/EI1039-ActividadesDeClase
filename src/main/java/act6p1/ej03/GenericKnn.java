package act6p1.ej03;

public abstract class GenericKnn {
    private final int n;
    GenericKnn(int n) {
        this.n = n;
    }
    public void train() {
        preparaDatos();
    }
    public String guess() {
        System.out.println("Infiere Clase");
        calculaDistancias();
        encuentraVecinos();
        seleccionaClase();
        return "Clase Inferida";
    }
    abstract void preparaDatos();
    abstract void calculaDistancias();

    public void encuentraVecinos() {
        System.out.println("Encontrando " + n + " vecinos mas cercanos");
    }

    public void seleccionaClase() {
        System.out.println("Seleccionada clase más popular entre los vecinos");
    }

}
