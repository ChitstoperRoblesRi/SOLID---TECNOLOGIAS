public class Main {
    public static void main(String[] args) {
        Piston miPiston = new Piston();
        Puerta miPuerta = new Puerta();
        Lampara miLampara = new Lampara();
        BloqueMusical miBloqueMusical = new BloqueMusical();

        System.out.println("Se activa la palanca");
        miPiston.Activar();
        miPuerta.Activar();
        miLampara.Activar();
        miBloqueMusical.Activar();

        System.out.println("Se desactiva la palanca");
        miPiston.Desactivar();
        miPuerta.Desactivar();
        miLampara.Desactivar();        
        miBloqueMusical.Desactivar();

        Zombie miZombie = new Zombie();
        Esqueleto miEsqueleto = new Esqueleto();

        miZombie.quemarLava();
        miEsqueleto.quemarLava();

        miZombie.Atacar();
        miEsqueleto.Atacar();
    }
}
