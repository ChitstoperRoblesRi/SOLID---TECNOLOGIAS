package Actividad_Rojas.Refactory;

public class DonRamon implements Inquilino, Habitante{
    private String nombre = "Don Ramon";

    @Override
    public void pagarRenta(){
        System.out.println(nombre + " le jura al señor barriga que le paga la seaman siguiente.");
    }

    @Override
    public void interactuarConElChavo(){
        System.out.println(nombre + " le pega al chavo.");
    }
}
