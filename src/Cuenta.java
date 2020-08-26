public class Cuenta {

    private int numeroCuenta;
    private double saldo;

    public Cuenta(int cuenta, double saldoini) {
        numeroCuenta = cuenta;
        saldo = saldoini;
    }

    public double Consignar(double cantidad) {
        saldo = saldo + cantidad;
        return cantidad;
    }

    public double Retirar(double cantidad) {
        saldo = saldo - cantidad;
        return cantidad;
    }

    public double saldo() {
        return saldo;
    }

}
