import java.util.Scanner;

public class OperacionesBasicas {

    static String calculadora(String operacion, float primerNumero, float segundoNumero) {

        // Creamos todas las condiciones para operar.

        switch (operacion) {
            case "+":
                return (primerNumero + " + " + segundoNumero + " = " + (primerNumero + segundoNumero));
            case "-":
                return (primerNumero + " - " + segundoNumero + " = " + (primerNumero - segundoNumero));
            case "*":
                return (primerNumero + " * " + segundoNumero + " = " + (primerNumero * segundoNumero));
            case "/":
                return (primerNumero + " / " + segundoNumero + " = " + (primerNumero / segundoNumero));

            default:
                return ("Operación incorrecta");
        }
    }

    public static void main(String[] args) {

        // Declaramos las variables.

        String operacion;
        float primerNumero;
        float segundoNumero;

        // Creamos el objeto "teclado" para introducir datos.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la operación que quieres hacer. Disponibles : +, -, *, /");
        operacion = teclado.next();

        System.out.println("Introduce el primer número: ");
        primerNumero = teclado.nextFloat();

        System.out.println("Introduce el segundo número: ");
        segundoNumero = teclado.nextFloat();

        // Llamamos el método que nos hará las operaciones básicas.

        System.out.println(calculadora(operacion, primerNumero, segundoNumero));

        teclado.close();
    }
}