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
        System.out.print("Ingrese los siguientes datos nombre, apellido, correo\n");
        nombre = sc.nextLine();
        System.out.print("Nombre: " + nombre+"\n");
        apellido = sc.nextLine();
        System.out.print("Apellido: " + apellido+"\n");
        correo = sc.nextLine();

        totalCuenta = Cuenta1.saldo();
        System.out.println("Total de saldo actual en la cuenta: " + totalCuenta + " COP");
        double valconsigna=4000;
        System.out.println("Se ingresaron en la cuenta: " + valconsigna + "COP");
        Cuenta1.Consignar(valconsigna);

        double valorretiro=5000;
        System.out.println( "Se retiraron de la cuenta: "+ valorretiro+ "COP");
        Cuenta1.Retirar(valorretiro);
        System.out.println("-----------------------------------------------------------------");

        // Consultamos el saldo de nuevo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Datos de usuario: " + "[" + nombre + "," + apellido + "," + correo + "]");
        System.out.println("Total actual en la cuenta: " + totalCuenta + " COP");
    }

}
