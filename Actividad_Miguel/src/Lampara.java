public class Lampara implements ActivablePorRedstone{
    
    @Override
    public void Activar(){
        System.out.println("Lampara encendida");
    }

    @Override
    public void Desactivar() {
        System.out.println("Lampara apagada");
    }
}
