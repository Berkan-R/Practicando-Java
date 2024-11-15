import java.util.Scanner;

public class ValidadorEntero {

    public static String esEntero(double numero) {

        if (numero % 1 == 0) {
            return "Es entero";

        } else
            return "Tiene que ser un número entero!";
    }

    public static void main(String[] args) {

        double numero;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Dame un número entero: ");
            numero = teclado.nextDouble();

            System.out.println(esEntero(numero));

        } while (numero % 1 != 0);

        teclado.close();
    }
}