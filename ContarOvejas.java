import java.util.Scanner;

public class ContarOvejas {

    /*
     * Creamos dos excepciones, que son: Cundo el número de ovejas es 0 y 1.
     * Seguidamente hacemos un bucle que cuenta y muestra por pantalla todas las
     * ovejas, empezando por la primera hasta la última.
     */

    static String contadorOvejas(int ovejas) {

        String cantidadOvejas = "";

        if (ovejas == 0) {
            cantidadOvejas = "";
        }

        else if (ovejas == 1) {
            cantidadOvejas = "1 oveja...";
        }

        else

            for (int i = 1; i <= ovejas; i++) {
                cantidadOvejas = cantidadOvejas + i + "ovejas...";
            }

        return cantidadOvejas;
    }

    public static void main(String[] args) {

        // La entrada será la cantidad de ovejas que queremos contar.

        int numeros;

        // Creamos el objeto "teclado" para poder introducir datos por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de ovejas: ");
        numeros = teclado.nextInt();

        // Invocamos el método que nos cuenta por pantalla la cantidad de ovejas.

        System.out.println(contadorOvejas(numeros));

        teclado.close();
    }
}