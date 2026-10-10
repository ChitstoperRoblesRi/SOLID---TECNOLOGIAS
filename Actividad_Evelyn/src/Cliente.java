package Actividad_Evelyn.src;

public class Cliente {
    private String nombre;
    private String id;
    private CuentaBancaria cuenta;

    public Cliente(String nombre, String id, CuentaBancaria cuenta){
        this.id = id;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre(){
        return nombre;
    }

    public String getID(){
        return id;
    }

    public CuentaBancaria getCuenta(){
        return cuenta;
    }

    public void depositar(double cantidad){
        cuenta.depositar(cantidad);
    }

    public void retirar(double cantidad){
        cuenta.retirar(cantidad);
    }

    public double consultarSaldo(){
        return cuenta.consultarSaldo();
    }

    public double calcularIntereses(){
        return cuenta.calcularIntereses();
    }

    public void pagarDeuda(double cantidad){
        cuenta.pagarDeuda(cantidad);
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id );
        System.out.println("Cuenta: " + cuenta);
    }
}