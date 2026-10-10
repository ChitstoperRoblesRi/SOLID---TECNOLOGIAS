package Actividad_Rojas.Refactory;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception{
        Ñoño ñoño = new Ñoño();
        DonRamon donRamon = new DonRamon();
        ProfeJirafales jirafales = new ProfeJirafales();

        List<Educador> educadores = List.of(jirafales);
        for (Educador e : educadores){
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }

        List<Inquilino> inquilinos = List.of(donRamon);
        for (Inquilino i : inquilinos) {
            i.pagarRenta();
        }

        List<Habitante> habitantes = List.of(donRamon, jirafales);
        for (Habitante h : habitantes) {
            h.interactuarConElChavo();
        }

        List<Niño> niños = List.of(ñoño);
        for (Niño n : niños) {
            n.llorar();
            n.cantar();
        }
    }
}