namespace Actividad_Harry.Fabrica;
using Actividad_Harry.Aliens;

public static class FabricaAlien
{
    public static IAlien CrearDesdeMuestra(MuestraADN muestra)
    {
        return new CreadorAlien(muestra.Nombre, muestra.Descripcion, muestra.Habilidad);
    }
}