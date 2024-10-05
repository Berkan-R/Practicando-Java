import java.util.Scanner;

public class AbreviarNombre {
    public static void main(String[] args) {

        // La variable de entrada será un String.

        String nombre;

        // Creamos el objeto teclado por donde se van a introducir los nombres.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        nombre = teclado.nextLine();

        /*
         * Extraemos el carácter del primer string que está en la posición 0. Depués
         * buscamos el espacio entre los nombres y le sumamos +1 y así extraemos el
         * primer carácter del segundo nombre dentro del mismo String. Finalmente,
         * pasamos todo a mayúsculas.
         */

        System.out.println("Tu abreviatura es: "
                + (nombre.charAt(0) + "." + nombre.charAt(nombre.indexOf(" ") + 1)).toUpperCase());

        teclado.close();
    }
}