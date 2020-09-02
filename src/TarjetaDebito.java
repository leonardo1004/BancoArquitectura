public class TarjetaDebito {
    double saldoTarjetaD;

    public TarjetaDebito(double saldoTarjetaD) {
        this.saldoTarjetaD = saldoTarjetaD;
    }

    @Override
    public String toString() {
        return "TarjetaDebito{" +
                "saldoTarjetaD=" + saldoTarjetaD +
                '}';
    }
}
