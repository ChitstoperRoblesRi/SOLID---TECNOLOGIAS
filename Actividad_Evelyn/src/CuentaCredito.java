package Actividad_Evelyn.src;

public class CuentaCredito extends CuentaBancaria{
    private double limiteCredito;
    private double deuda;
    private double tasaInteres;

    public CuentaCredito(String numeroCuenta, double saldoInicial, double limiteCredito, double deuda, double tasaInteres){
        super(numeroCuenta, saldoInicial);
        this.limiteCredito = 10000;
        this.deuda = deuda;
        this.tasaInteres = 0.02;
    }

    public double calcularIntereses(){
        return saldo * tasaInteres;
    }

    public void pagarDeuda(double cantidad){

    }
}