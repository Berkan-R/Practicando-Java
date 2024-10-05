import java.util.Scanner;

public class SumaCincoNumeros {
  public static void main(String[] args) {

    // Declaramos los cinco números de entrada

    float primer_numero, segundo_numero, tercer_numero, cuarto_numero, quinto_numero;

    // Creamos un objeto numeros con el constructor "Scanner".

    Scanner numeros = new Scanner(System.in);

    // Pedimos todos los números por consola.

    System.out.println("Escribe el primer número: ");
    primer_numero = numeros.nextInt();

    System.out.println("Escribe el segundo número: ");
    segundo_numero = numeros.nextInt();

    System.out.println("Escribe el tercer número: ");
    tercer_numero = numeros.nextInt();

    System.out.println("Escribe el cuarto número: ");
    cuarto_numero = numeros.nextInt();

    System.out.println("Escribe el quinto número: ");
    quinto_numero = numeros.nextInt();

    // Sumamos todos los números

    System.out.println(
        "El resultado es: " + (primer_numero + segundo_numero + tercer_numero + cuarto_numero + quinto_numero));

    numeros.close();
  }
}