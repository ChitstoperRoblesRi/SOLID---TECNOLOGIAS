package Actividad_Justin.Refactory;

public class App {
    public static void main(String[] args) throws Exception{
        Bebida[] bebidas = {
            new Agua("Ciel", 20),
            new Refresco("COCA", 25),
            new Cerveza("Coronita", 30)
        };

        Caja caja = new Caja();
        caja.cobrar(bebidas, new DescuentoNavidad(), 100);
    }
}