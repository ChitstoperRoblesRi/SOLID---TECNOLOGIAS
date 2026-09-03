public class Esqueleto extends MobHostil{
    public Esqueleto () {
        super("Esqueleto", 20);
    }

    @Override
    public void Atacar(){
        System.out.println("Esqueleto dispara una flecha");
    }
}
