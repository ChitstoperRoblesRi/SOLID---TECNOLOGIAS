package MC;

public class Puerta implements ActivablePorRedstone{
    
    @Override
    public void Activar(){
        System.out.println("Puerta se abre");
    }

    @Override
    public void Desactivar(){
        System.out.println("Puerta se cierra");
    }
}
