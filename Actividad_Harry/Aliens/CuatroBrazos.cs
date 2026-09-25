namespace Actividad_Harry.Aliens;

public class CuatroBrazos : IAlien
{
    public virtual string Nombre => "Cuatro Brazos";
    public virtual string Descripcion => "Tetramand | Posee super fuerza, piel blindada y cuatro brazos";
    public virtual void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} ataca con aplauso sonico");
    }
}