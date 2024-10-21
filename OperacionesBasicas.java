import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {

        // Inicializamos las variables.

        String operacion = "";
        int primerNumero = 0;
        int segundoNumero = 0;

        // Creamos el objeto teclado para introducir datos por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribeme la operación que quieres hacer. Disponibles : +, -, *, /");
        operacion = teclado.next();

        System.out.println("Pasame el primer número: ");
        primerNumero = teclado.nextInt();

        System.out.println("Pasame el segundo número: ");
        segundoNumero = teclado.nextInt();

        // Creamos todas las condiciones para operar.

        if (operacion.equals("+"))
            System.out.println(primerNumero + " + " + segundoNumero + " = " + (primerNumero + segundoNumero));
        else if (operacion.equals("-"))
            System.out.println(primerNumero + " - " + segundoNumero + " = " + (primerNumero - segundoNumero));
        else if (operacion.equals("*"))
            System.out.println(primerNumero + " * " + segundoNumero + " = " + (primerNumero * segundoNumero));
        else if (operacion.equals("/"))
            System.out.println(primerNumero + " / " + segundoNumero + " = " + (primerNumero / segundoNumero));
        else
            System.out.println("Escribe bien la operacion!");

        teclado.close();
    }
}