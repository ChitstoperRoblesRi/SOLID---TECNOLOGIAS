package Actividad_Rojas.src;

public class App {
    public static void main(String[] args) throws Exception {
        DonRamon Ramon = new DonRamon();
        DoñaFlorinda Florinda = new DoñaFlorinda();
        Ñoño Ñoño = new Ñoño();


        System.out.println("-- La vecindad del chavo --");
        Ramon.darGolpe();

        try{
            Ramon.cobrarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ramon.pagarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ramon.jugar();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ramon.llorar();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        Florinda.darGolpe();

        try{
            Florinda.cobrarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Florinda.pagarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Florinda.jugar();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Florinda.llorar();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        Ñoño.darGolpe();

        try{
            Ñoño.cobrarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ñoño.pagarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ñoño.jugar();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ñoño.llorar();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}