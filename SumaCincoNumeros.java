import java.util.Scanner;

public class SumaCincoNumeros {
  public static void main(String[] args) {

    // Creamos un objeto numeros con el constructor "Scanner"

    Scanner numeros = new Scanner(System.in);

    // Pedimos todos los numeros por consola y los guardamos en una variable de tipo entero

    System.out.println("Escribe el primero número: ");
    int primer_numero = numeros.nextInt();

    System.out.println("Escribe el segundo número: ");
    int segundo_numero = numeros.nextInt();

    System.out.println("Escribe el tercer número: ");
    int tercer_numero = numeros.nextInt();

    System.out.println("Escribe el cuarto número: ");
    int cuarto_numero = numeros.nextInt();

    System.out.println("Escribe el quinto número: ");
    int quinto_numero = numeros.nextInt();

    // Sumamos los números antes de imprimir por pantalla, porque si no, nos sumará una cadena de Strings y no enteros

    System.out.println("El resultado es: " + (primer_numero + segundo_numero + tercer_numero + cuarto_numero + quinto_numero));
    
    numeros.close();
  }
}