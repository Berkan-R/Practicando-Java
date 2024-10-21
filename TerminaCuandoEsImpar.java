public class TerminaCuandoEsImpar {
    public static void main(String[] args) {

        int numero;

        // Comprueba si el dato de entrada es un entero. Validando datos de entrada.

        do {
            System.out.println("Dame un numero: ");
            numero = Integer.parseInt(System.console().readLine());

            if (numero % 2 == 0) {
                System.out.println("Esto es un numero par " + numero);
            } else {
                System.out.println("numero impar, chau!");
            }
        } while (numero % 2 == 0);
    }
}