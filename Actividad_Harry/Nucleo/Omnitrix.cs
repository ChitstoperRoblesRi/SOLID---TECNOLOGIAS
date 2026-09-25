namespace Actividad_Harry.Nucleo;
using Actividad_Harry.Aliens;

public class Omnitrix
{
    public IAlien? AlienActual { get; private set;}
    public bool EsTrans => AlienActual != null;
    public void Transformar(IAlien alien)
    {
        AlienActual = alien;
        System.Console.WriteLine($"Transformacion completada. Ahora eres {AlienActual.Nombre}");
    }
    public void DesTransformar()
    {
        if(AlienActual != null)
        {
            System.Console.WriteLine($"Timeout. {AlienActual.Nombre} ahora es Ben");
            AlienActual = null;
        }
    }
}