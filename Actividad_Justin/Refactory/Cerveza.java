package Actividad_Justin.Refactory;

public class Cerveza extends Bebida{

    private final double IEPS = 0.25;

    public Cerveza(String nombreBebida, double precioBase){
        super(nombreBebida, Etiqueta.CON_IEPS, precioBase);
    }

    @Override
    public boolean requiereINE(){
        return true;
    }

    @Override
    public double calcularTotal(){
        return getPrecioBase() * (1 + IVA) * (1 + IEPS);
    }
}