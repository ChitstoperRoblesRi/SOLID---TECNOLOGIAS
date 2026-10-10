package Actividad_Rojas.Refactory;

public class Ñoño implements Niño{
    private String nombre = "ñoño";

    @Override 
    public void llorar(){
        System.out.println(nombre + " Ajai, Ajai.");
    }

    @Override 
    public void cantar(){
        System.out.println(nombre + " que bonita vecindad, es la vecindad del chavo.");
    }
}
