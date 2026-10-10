package Actividad_Rojas.src;

public class Ñoño implements AccionesPersonaje{
    private final String nombre = "Ñoño";
    
    @Override
    public void darGolpe(){
        System.out.println(" :(golpe)");
    }

    @Override
    public void pagarRenta(){
        throw new UnsupportedOperationException(nombre + ": Nunca paga renta.");
    }

    @Override
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + ": No es dueño de la vecindad del chavo.");
    }

    @Override 
    public void jugar(){
        throw new UnsupportedOperationException(nombre + ": Juega con su pelota de playa.");
    }

    @Override
    public void llorar(){
        throw new UnsupportedOperationException(nombre + ": Ajai, Ajai.");
    }
}
