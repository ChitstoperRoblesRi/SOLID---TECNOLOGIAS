namespace Actividad_Harry.Extensiones;
using Actividad_Harry.Aliens;

public class Skurd : IAlien
{
    private readonly IAlien _alienBase;
    private readonly IAlien _alienDonante;

    public Skurd( IAlien alienBase, IAlien alienDonador)
    {
        _alienBase = alienBase;
        _alienDonante = alienDonador;
    }

    public string Nombre => $"{_alienBase.Nombre} + Skurd({_alienDonante.Nombre})";
    public string Descripcion => $"{_alienBase.Descripcion} con las habilidades de {_alienDonante.Descripcion}";
    public void UsarHabilidad()
    {
        _alienBase.UsarHabilidad();
        System.Console.WriteLine("Skurd se activa y presta una habilidad extra: ");
        _alienDonante.UsarHabilidad();
    }
}
