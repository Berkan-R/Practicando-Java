import java.util.Scanner;

public class LongitudEntero {
    public static void main(String[] args) {

        // Declaramos el número que nos dará el usuario y inicializamos el contador.

        int numero;
        int numero_cifras = 0;

        // Creamos el objeto teclado para poder pedir los datos al usuario.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt();

        // Recorremos la longitud del entero.

        while (numero != 0) {
            numero = numero / 10;
            numero_cifras++;
        }

        System.out.println(numero_cifras);

        teclado.close();
    }
}