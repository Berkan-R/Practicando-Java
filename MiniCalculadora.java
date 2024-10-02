import java.util.Scanner;

public class MiniCalculadora {
  public static void main(String[] args) {

    // Declaramos los datos de entrada

    String operación;
    float primer_número, segundo_número;

    // Creamos el objeto "datos" que nos va recoger los datos por teclado con el constructor Scanner.

    Scanner datos = new Scanner(System.in);

    // Pedimos los datos de entrada por teclado al usuario

    System.out.println("Escribe el primer número: ");
    primer_número = datos.nextFloat();

    System.out.println("Escribe el segundo número: ");
    segundo_número = datos.nextFloat();

    System.out.println("Elige alguna de estas tres opreraciones: SUMA, RESTA, MULTIPLICACIÓN o DIVISIÓN: ");
    operación = datos.next();
    
    // Comparamos las cuatro operaciones posibles con los datos pasados por teclado, añadimos una excepción si no coinciden

    if (operación.equals("SUMA"))
        System.out.println("El resultado de la suma es: " + (primer_número + segundo_número));
    
    else if (operación.equals("RESTA"))
        System.out.println("El resultado de la resta es: " + (primer_número - segundo_número));
    
    else if (operación.equals("MULTIPLICACIÓN"))
        System.out.println("El resultado de la multiplicación es: " + (primer_número * segundo_número));
    
    else if (operación.equals("DIVISIÓN"))
        System.out.println("El resultado de la división es: " + (primer_número / segundo_número));

    else
        System.out.println("Escribe bien la operación en la consola!!!");
    
    datos.close();
  }
}
