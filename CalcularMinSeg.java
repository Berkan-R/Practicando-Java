import java.util.Scanner;

public class CalcularMinSeg {
    public static void main(String[] args) {

        // El input será los segundos que nos porporcione el usuario.

        int segundos;

        // Creamos el objeto "teclado" para poder introducir datos.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Pasame los segundos: ");
        segundos = teclado.nextInt();

        /*
         * Mostramos por pantalla los segundos que nos ha dado el usuario y la
         * transformación. Siguiento el siguiente estándar: X min y X seg.
         */

        System.out.println(segundos + " seg son: " + segundos / 60 + " min y " + segundos % 60 + " seg");

        teclado.close();
    }
}