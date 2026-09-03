public class Zombie extends MobHostil {
    
    public Zombie () {
        super("Zombie", 20);
    }

    @Override
    public void Atacar(){
        System.out.println("Zombie ataca cuerpo a cuerpo");
    }
}
