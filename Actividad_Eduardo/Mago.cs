class Mago : Personaje, IHabilidadEspecial
{
    public Mago (string nombre) : base(nombre)
    {
        
    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} lanzó una bola de fuego a {objetivo.nombre}");
        objetivo.RecibirDano(15);
    }

    public void UsarHabilidad()
    {
        puntosVida += 30;
        if (puntosVida > 100) puntosVida = 100;
        System.Console.WriteLine($"{nombre} regenero 30 puntos de vida, su vida acutal es {puntosVida}");
    }
}

internal interface IHabilidadEspecial
{
    void UsarHabilidad();
}