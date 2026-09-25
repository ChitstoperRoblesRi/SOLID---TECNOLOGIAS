namespace Actividad_Harry.Extensiones;
using Actividad_Harry.Aliens;

public class Fusion<TAlienA, TAlienB> : IAlien
    where TAlienA : IAlien, new()
    where TAlienB : IAlien, new()
{
    private readonly TAlienA _alienA = new();
    private readonly TAlienB _alienB = new();

    public string Nombre => $"Fusión ({_alienA.Nombre} + {_alienB.Nombre})";
    public string Descripcion => $"Combina habilidades de: {_alienA.Nombre} + {_alienB.Nombre}.";

    public void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} activa ambas mitades de su ADN fusionado: ");
        _alienA.UsarHabilidad();
        _alienB.UsarHabilidad();
    }
}
