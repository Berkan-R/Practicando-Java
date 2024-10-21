import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {

        // Declaramos los datos de entrada.

        String operacion;
        float primer_numero, segundo_numero;

        // Creamos el objeto "datos" que nos va recoger los datos por teclado.

        Scanner datos = new Scanner(System.in);

        // Pedimos los datos de entrada por teclado al usuario.

        System.out.println("Escribe el primer número: ");
        primer_numero = datos.nextFloat();

        System.out.println("Escribe el segundo número: ");
        segundo_numero = datos.nextFloat();

        System.out.println("Elige alguna de estas tres opreraciones: SUMA, RESTA, MULTIPLICACIÓN o DIVISIÓN: ");
        operacion = datos.next();

        /*
         * Comparamos las cuatro operaciones posibles con los datos pasados por teclado,
         * añadimos una excepción si no coinciden.
         */

        if (operacion.equals("SUMA"))
            System.out.println("El resultado de la suma es: " + (primer_numero + segundo_numero));

        else if (operacion.equals("RESTA"))
            System.out.println("El resultado de la resta es: " + (primer_numero - segundo_numero));

        else if (operacion.equals("MULTIPLICACIÓN"))
            System.out.println("El resultado de la multiplicación es: " + (primer_numero * segundo_numero));

        else if (operacion.equals("DIVISIÓN"))
            System.out.println("El resultado de la división es: " + (primer_numero / segundo_numero));

        else
            System.out.println("Escribe bien la operacion en la consola!!!");

        datos.close();
    }
}