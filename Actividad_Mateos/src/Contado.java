package Actividad_Mateos.src;
public class Contado implements MetodoPago{
    private boolean estadoBilletes;

    public Contado(boolean estadoBilletes){
        this.estadoBilletes = estadoBilletes;
    }

    @Override
    public boolean validar(){
        if(estadoBilletes == true){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pagar(double monto){
        System.out.println("El billete esta en buen estado y se pago correctamente");
    }
}
