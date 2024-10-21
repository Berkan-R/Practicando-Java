import java.util.Scanner;

public class ContarOvejas {
    public static void main(String[] args) {

        // La entrada será la cantidad de números de ovejas que queremos contar.

        int numeros;

        // Creamos el objeto para poder introducir datos por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Pasame el número de ovejas: ");
        numeros = teclado.nextInt();

        /*
         * Creamos dos excepciones, que son: Cundo el número de ovejas es 0 y 1.
         * Seguidamente hacemos un bucle que cuenta y muestra por pantalla todas las
         * ovejas, empezando por la primera hasta la última.
         */

        if (numeros == 0)
            System.out.println("");

        else if (numeros == 1)
            System.out.println("1 oveja...");

        else

            for (int i = 1; i <= numeros; i++)
                System.out.print(i + "ovejas...");

        teclado.close();
    }
}