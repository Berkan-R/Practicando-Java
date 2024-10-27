import java.util.Scanner;

public class CalcularMinSeg {

    /*
     * Mostramos por pantalla los segundos que nos ha dado el usuario y la
     * transformación. Siguiendo el siguiente estándar: X min y X seg.
     */

    static String calcularMinSeg(int segundos) {
        return (segundos + " seg son: " + segundos / 60 + " min y " + segundos % 60 + " seg");
    }

    public static void main(String[] args) {

        // El input será los segundos que nos porporcione el usuario.

        int segundos;

        // Creamos el objeto "teclado" para poder introducir datos.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los segundos: ");
        segundos = teclado.nextInt();

        // Llamamos al método que nos hace el calculo para minutos y segundos.

        System.out.println(calcularMinSeg(segundos));

        teclado.close();
    }
}