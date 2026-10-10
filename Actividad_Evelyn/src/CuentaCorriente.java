package Actividad_Evelyn.src;

public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobregiro;
    private double tasainteres;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteSobregiro, double tasaInteres){
        super(numeroCuenta, saldoInicial);
        if(limiteSobregiro < 0){
            throw new IllegalArgumentException("El limite Sobregiro no debe ser menor que 0");
        }
        this.limiteSobregiro = limiteSobregiro;
        this.tasainteres = 0.02;
    }

    @Override
    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if(cantidad > saldo + limiteSobregiro){
            throw new IllegalArgumentException("La operacion exxcede el limite");
        }
        saldo -= cantidad;
    }

    public double calcularIntereses(){
        if(saldo < 0){
            limiteSobregiro = Math.abs(saldo);
            return limiteSobregiro + tasainteres;
        }
        return 0;
    }

    public double ConsultarSobregiroUtilizado(){
        if(saldo < 0){
            return Math.abs(saldo);
        }
        return 0;
    }

    public void pagarDeuda(double cantidad){
        throw new IllegalArgumentException("");
    }

    public double getLimiteSobregiro(){
        return limiteSobregiro;
    }
}
