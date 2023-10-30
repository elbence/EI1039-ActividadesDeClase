package act5p2;

public abstract class BaseDecoratorCajaDeTe implements CajaDeTe {
    private final CajaDeTe cajaDeTeEnvuelta;

    public BaseDecoratorCajaDeTe(CajaDeTe cajaDeTe) {
        cajaDeTeEnvuelta = cajaDeTe;
    }

    @Override
    public int imprimeContenido() {
        return cajaDeTeEnvuelta.imprimeContenido();
    }
}
