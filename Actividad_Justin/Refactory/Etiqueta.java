package Actividad_Justin.Refactory;

public enum Etiqueta {

    SIN_IVA("(Libre de impuestos)"),
    CON_IVA("(IVA incluido)"),
    CON_IEPS("(IVA + IEPS incluido)");

    private final String descripcion;

    Etiqueta(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
}