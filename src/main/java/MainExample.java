public class MainExample {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");
        CajaDeCajasDeTe paquete_1 = new CajaDeCajasDeTe();
        paquete_1.anade(new CajaDeTeBlanco());
        paquete_1.anade(new CajaDeTeBlanco());
        paquete_1.anade(new CajaDeTeVerde());

        CajaDeCajasDeTe paquete_2 = new CajaDeCajasDeTe();
        paquete_2.anade(new CajaDeTeVerde());
        paquete_2.anade(new CajaDeTeVerde());
        paquete_2.anade(new CajaDeTeBlanco());

        CajaDeCajasDeTe paquete = new CajaDeCajasDeTe();
        paquete.anade(paquete_1);
        paquete.anade(paquete_2);

        int total_unidades = paquete.imprimeContenido();

        System.out.println("El envío a Asia contiene " + total_unidades + " unidades de té");
    }
}
