import java.util.Scanner;

// Este método comprueba si un número es primo o no.

public class EsPrimo {

    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int contador = 2; contador < numero; contador++) {
            if (numero % contador == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean resultado;
        int numero;

        Scanner teclado = new Scanner(System.in);

        // Pedimos el número por teclado al usuario.

        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        // Llamamos al método y guardamos el resulado en una variable.

        resultado = numeroPrimo(numero);

        // Mostramos por pantalla el resultado al usuario.

        System.out.println(resultado);

        teclado.close();
    }
}