import java.util.Scanner;

public class CalcularMinutosSegundos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int segundos;
        System.out.println("Pasame los segundos: ");
        segundos = teclado.nextInt();

        System.out.println(segundos + " segundos son: " + segundos/60 + " minutos " + segundos%60 + " segundos");

        teclado.close();;
    }
}