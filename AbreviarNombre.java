import java.util.Scanner;

public class AbreviarNombre {

    /*
     * Extraemos el carácter del primer string que está en la posición 0. Depués
     * buscamos el espacio entre los nombres y le sumamos +1 y así extraemos el
     * primer carácter del segundo nombre dentro del mismo String. Finalmente,
     * pasamos todo a mayúsculas.
     */

    static String abreviarNombre(String nombre) {
        return (nombre.charAt(0) + "." + nombre.charAt(nombre.indexOf(" ") + 1)).toUpperCase();
    }

    public static void main(String[] args) {

        // La variable de entrada será un String.

        String nombre;

        // Creamos el objeto "teclado" por donde se va a introducir el nombre.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        nombre = teclado.nextLine();

        // Llamamos el método.

        System.out.println(abreviarNombre(nombre));

        teclado.close();
    }
}