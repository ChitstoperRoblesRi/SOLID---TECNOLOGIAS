package MC;

public abstract class MobHostil {
    String nombre;
    int salud;

    public MobHostil (String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public void quemarLava () {
        this.salud -= 5;
        System.out.println(nombre + " se quemó en la lava. Salud restante: " + salud + " HP");
    }

    public abstract void Atacar();
}
