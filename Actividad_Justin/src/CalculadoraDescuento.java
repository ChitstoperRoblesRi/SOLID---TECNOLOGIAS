public class CalculadoraDescuento {
    public double aplicarDescuento(String tipoDescuento, double  subtotal){
        if(tipoDescuento.equals("descuentoNavidad")){
            return subtotal * 0.9;
        } else if(tipoDescuento.equals("sinDescuento")){
            return subtotal;
        } else{
            throw new IllegalArgumentException("Descuento no valido");
        }
    }
}