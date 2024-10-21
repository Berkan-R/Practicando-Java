import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {

        // Inicializamos la variable número

        double numero;

        // Creamos el objeto teclado para introducir datos por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        numero = teclado.nextFloat();

        // Creamos la condición que se necesita para ver si un número es par o no.

        if (numero % 2 == 0 || numero == 0)
            System.out.println(true);

        else
            System.out.println(false);

        teclado.close();
    }
}