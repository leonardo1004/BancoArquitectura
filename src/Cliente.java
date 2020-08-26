import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        double totalCuenta;
        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(1004012, 50000.70);
        String nombre;
        String apellido;
        String correo;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los siguientes datos nombre, apellido, correo");
        nombre = sc.nextLine();
        System.out.print("Nombre: " + nombre);
        apellido = sc.nextLine();
        System.out.print("Apellido: " + apellido);
        correo = sc.nextLine();
        System.out.print("Correo: " + correo);

        totalCuenta = Cuenta1.saldo();
        System.out.println("Total de saldo actual en la cuenta: " + totalCuenta + " COP");
        double valconsigna=4000;
        System.out.println("Se ingresaron en la cuenta: " + valconsigna + " COP");
        Cuenta1.Consignar(valconsigna);

        System.out.println("-----------------------------------------------------------------");

        // Consultamos el saldo de nuevo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Datos de usuario: " + "[" + nombre + "," + apellido + "," + correo + "]");
        System.out.println("Total actual en la cuenta: " + totalCuenta + " COP");
    }

}
