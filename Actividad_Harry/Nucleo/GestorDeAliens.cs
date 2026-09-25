namespace Actividad_Harry.Nucleo;
using Actividad_Harry.Aliens;
using Actividad_Harry.Fabrica;
using Actividad_Harry.Extensiones;

public class GestorDeAliens
{
    private readonly List<(string Nombre, Func<IAlien> Crear, bool Desbloqueado )> _catalogo = new()
    {
        ("Fuego", () => new Fuego(), true),
        ("Humongusario", () => new Humongusario(), true),
        ("Cuatro Brazos", () => new CuatroBrazos(), true)
    };
    private readonly List<(string Nombre, Func<IAlien> Crear)> _escanearADN = new();
    private readonly Dictionary<Type, Func<IAlien>> _supremos = new()
    {
        { typeof(Humongusario), () => new HumongusarioSupremo() },
    };

    private readonly List<(string Nombre, Func<IAlien> Crear)> _recetasFusion = new()
    {
        ("Fuego + Cuatro Brazos", () => new Fusion<Fuego, CuatroBrazos>()),
    };

    public List<(string Nombre, Func<IAlien> Crear)> ObtenerDesbloqueados()
    {
        var lista = _catalogo
            .Where(a => a.Desbloqueado)
            .Select(a => (a.Nombre, a.Crear))
            .ToList();
        lista.AddRange(_escanearADN);
        return lista;
    }

    public List<string> ObtenerBloqueados() =>
        _catalogo.Where(a => !a.Desbloqueado).Select(a => a.Nombre).ToList();

    public void RegistrarAlienDesdeAdn(MuestraADN muestra)
    {
        var nombre = muestra.Nombre;
        _escanearADN.Add((nombre, () => FabricaAlien.CrearDesdeMuestra(muestra)));
    }

    public bool TieneSupremo(IAlien alien) => _supremos.ContainsKey(alien.GetType());

    public IAlien CrearSupremo(IAlien alien) => _supremos[alien.GetType()]();

    public List<(string Nombre, Func<IAlien> Crear)> ObtenerRecetasFusion() => _recetasFusion;

    public IAlien ElegirAlienAleatorio()
    {
        var disponibles = ObtenerDesbloqueados();
        var indice = Random.Shared.Next(disponibles.Count);
        return disponibles[indice].Crear();
    }
}
