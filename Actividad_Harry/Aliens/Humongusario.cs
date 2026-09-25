namespace Actividad_Harry.Aliens;

public class Humongusario : IAlien
{
    public virtual string Nombre => "Humongusario";
    public virtual string Descripcion => "Vaxasaurio | Posee super fuerza y puede crecer hasta 20 metros";
    public virtual void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} golpea el suelo y crea un mini terremoto");
    }
}