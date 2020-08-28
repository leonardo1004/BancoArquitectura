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

    public void Retirar(double cantidad) {
        if (saldo<cantidad){
            System.out.println("No se puede realizar el retiro");
        } else {
            saldo = saldo - cantidad;
        }
    }

    public double saldo() {
        return saldo;
    }
}
