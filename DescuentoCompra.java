import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {

        // Inicializamos todas las variables.

        float precio = 0;
        float descuentoInicial = 25 / 100F;
        float descuentoFinal = 50 / 100F;
        int numPiezas = 0;

        // Creamos el objeto teclado para obtener datos por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio inicial: ");
        precio = teclado.nextFloat();

        System.out.println("Introduce cuántas piezas has comprado: ");
        numPiezas = teclado.nextInt();

        // Creamos la condición necesaria para aplicar el descuento.

        if (numPiezas <= 3)
            System.out.println(precio * descuentoInicial);
        else
            System.out.println(precio * descuentoFinal);

        teclado.close();
    }
}