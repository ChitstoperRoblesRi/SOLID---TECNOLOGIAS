abstract class Personaje
{
    public string nombre {get ; private set;}
    public int puntosVida {get; protected set;}
    public bool estadoVida {get {return puntosVida > 0;}}

    public Personaje(string nombre)
    {
        this.nombre = nombre;
        puntosVida = 100;
    }

    public void RecibirDano(int cantidad)
    {
        puntosVida -= cantidad;
        if (puntosVida < 0 ) puntosVida = 0;
        System.Console.WriteLine($"{nombre} recibio un daño de {cantidad}, sus puntos de vida son: {puntosVida}");
    }

    public abstract void Ataque(Personaje objetivo);

}