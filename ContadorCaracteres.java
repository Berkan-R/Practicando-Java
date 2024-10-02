import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {

        // Creamos el objeto "captador" para poder introducir texto por teclado
        
        Scanner captador = new Scanner(System.in);
        
        // Declraración de variables

        String texto;

        System.out.println("Hola soy tu contador de caracteres, introduce un texto: ");
        texto = captador.nextLine();

        System.out.println("La cantidad de caracteres que tienes: " + texto.replace(" ", "").length());
    
        captador.close();
    }
}
