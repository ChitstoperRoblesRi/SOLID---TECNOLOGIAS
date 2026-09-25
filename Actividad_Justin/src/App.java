public class App {
    public static void main(String[] args) throws Exception {
        Caja caja = new Caja();
        VerificadorEdad edad = new VerificadorEdad();
        GeneradorEtiqueta etiqueta = new GeneradorEtiqueta();
        CalculadoraDescuento descuento = new CalculadoraDescuento();
        
        String[] bebidas = {"agua", "refresco", "tepache", "cerveza"};
        double subtotal = 0;

        for(String bebida : bebidas){
            double precioBebida = caja.calcularPrecio(bebida, 25);
            System.out.println(etiqueta.generarEtiqueta(bebida) + " -> $" + precioBebida + "| Requiere INE: " + edad.requiereINE(bebida));
            subtotal = precioBebida;
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento de Navidad");
        System.out.println("Total: " + descuento.aplicarDescuento("descuien", subtotal));


    }
}