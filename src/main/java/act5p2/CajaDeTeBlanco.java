package act5p2;

public class CajaDeTeBlanco implements CajaDeTe {
    @Override
    public int imprimeContenido() {
        System.out.println("Añado una caja de Te Blanco");
        return 60;
    }
}
