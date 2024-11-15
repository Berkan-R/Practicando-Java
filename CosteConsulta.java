import java.util.Scanner;

public class CosteConsulta {

    // Método que nos va comprobar el precio de cada consulta.

    static int costeConsulta(int numeroConsulta) {

        // Declaramos los precios por cada consulta.

        if (numeroConsulta >= 1 && numeroConsulta <= 2) {
            return 200;
        } else if (numeroConsulta > 2 && numeroConsulta <= 5) {
            return 150;
        }

        else if (numeroConsulta > 5) {
            return 100;
        }

        return 0;
    }

    public static void main(String[] args) {

        // Variable donde se va guardar el número de cita y el pago que se tiene que
        // realizar.

        int numeroCita, pagoFinal;

        Scanner teclado = new Scanner(System.in);

        // Pedimos la variable al usuario.

        System.out.print("Introduce el número de cita: ");
        numeroCita = teclado.nextInt();

        pagoFinal = costeConsulta(numeroCita);

        // Mostramos por pantalla al usuario.

        System.out.print(pagoFinal);

        teclado.close();
    }
}