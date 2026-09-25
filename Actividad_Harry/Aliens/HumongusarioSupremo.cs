namespace Actividad_Harry.Aliens;

public class HumongusarioSupremo : Humongusario
{
    public override string Nombre => "Humongusario Supremo";
    public override string Descripcion => "Vaxasaurio | Posee super fuerza, puede crecer hasta 20 metros y tiene metralletas en los brazos";

    public override void UsarHabilidad()
    {
        base.UsarHabilidad();
            System.Console.WriteLine($"{Nombre} lanza misiles de sus brazos");
    }
}