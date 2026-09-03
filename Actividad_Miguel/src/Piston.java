public class Piston implements ActivablePorRedstone{
        
    @Override
        public void Activar() {
            System.out.println("Piston se activa y empuja un bloque");
        }

        @Override
        public void Desactivar() {
            System.out.println("Piston se desactiva y retrae");
        }
}
