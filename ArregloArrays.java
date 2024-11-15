import java.util.Scanner;

public class ArregloArrays {
    public static void main(String[] args) {

        double sumaTotalPositivos = 0;
        double sumaTotalNegativos = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;
        int cantidadCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        Scanner teclado = new Scanner(System.in);

        // Primero solicitamos la longitud del array.

        System.out.print("Introduce la longitud del array: ");
        int longitudNumeros = teclado.nextInt();

        int numeros[] = new int[longitudNumeros]; // Guardamos la longitud que tendrá nuestro array.

        System.out.print("Introduce todos los números: ");

        for (int contador = 0; contador < numeros.length; contador++) {
            numeros[contador] = teclado.nextInt();

            if (numeros[contador] > 0) {
                sumaTotalPositivos += numeros[contador];
                contadorPositivos++; // Cuenta la cantidad de positivos que hay en el array.
            }

            else if (numeros[contador] < 0) {
                sumaTotalNegativos += numeros[contador];
                contadorNegativos++; // Cuenta la cantidad de negativos que hay en el array.
            }

            else if (numeros[contador] == 0) {
                cantidadCeros++;
            }

        }

        if (contadorPositivos > 0) {
            mediaPositivos = sumaTotalPositivos / contadorPositivos;
        }

        if (contadorNegativos > 0) {
            mediaNegativos = sumaTotalNegativos / contadorNegativos;
        }

        System.out.println("La media de los números positivos dentro del array es: " + mediaPositivos);
        System.out.println("La media de los números negativos dentro del array es: " + mediaNegativos);
        System.out.println("La canidad de ceros que hay en el array es: " + cantidadCeros);

        teclado.close();
            
        }
    }
