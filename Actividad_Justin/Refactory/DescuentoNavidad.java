package Actividad_Justin.Refactory;

public class DescuentoNavidad implements Descuento{
    
    @Override
    public double aplicar(double total){
        return total * 0.9;
    } 

    @Override
    public String getDescripcion(){
        return "Descuento de Navidad";
    }
}