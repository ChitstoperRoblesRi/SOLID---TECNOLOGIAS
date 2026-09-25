package Actividad_Mateos.SRP;
public interface MetodoPago {
    boolean validar();

    void pagar(double monto);
}
