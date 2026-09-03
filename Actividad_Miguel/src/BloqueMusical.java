public class BloqueMusical implements ActivablePorRedstone{
    @Override
    public void Activar(){
        System.out.println("Bloque suena");
    }

    @Override
    public void Desactivar(){
        System.out.println("Bloque no hace nada");
    }
}
