import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {
    @Test
    public void Consignar() throws Exception {
        Cuenta cu1 = new Cuenta(1004012, 50000.70);
        double valconsigna = 4000;
        double total;
        total = cu1.Consignar(valconsigna);
    }
}