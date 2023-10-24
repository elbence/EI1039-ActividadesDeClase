package act5p1;

public class CajaDeTeVerde implements CajaDeTe{
    @Override
    public int imprimeContenido() {
        System.out.println("Añado una caja de Te Verde");
        return 24;
    }
}
