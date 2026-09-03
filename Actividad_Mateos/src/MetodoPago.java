package Actividad_Mateos.src;
public interface MetodoPago {
    boolean validar();

    void pagar(double monto);
}
