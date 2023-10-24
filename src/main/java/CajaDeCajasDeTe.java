import java.util.ArrayList;
import java.util.List;

public class CajaDeCajasDeTe implements CajaDeTe{

    private List<CajaDeTe> cajasDeTe;

    public CajaDeCajasDeTe() {
        cajasDeTe = new ArrayList<>();
    }

    public void anade(CajaDeTe c) {
        cajasDeTe.add(c);
    }

    public void quita(CajaDeTe c) {
        cajasDeTe.remove(c);
    }

    public List<CajaDeTe> contenido() {
        return cajasDeTe;
    }

    @Override
    public int imprimeContenido() {
        int suma = 0;
        for (CajaDeTe c : cajasDeTe) {
            suma += c.imprimeContenido();
        }
        System.out.println("Esta caja de cajas de Te consta de " + suma + " unidades");
        return suma;
    }
}
