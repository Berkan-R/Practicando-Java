import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        
        // Declaración de variables

        String jugador1;
        String jugador2;

        // Creamos el objeto "recopilador" y pedimos datos por teclado
 
        Scanner recopilador = new Scanner(System.in);

        System.out.println("Jugador 1 introduce => Piedra, Papel o Tijera: ");
        jugador1 = recopilador.nextLine();

        System.out.println("Posibilidades 2 introduce => Piedra, Papel o Tijera: ");
        jugador2 = recopilador.nextLine();
        
        // Creamos las condiciones y mostramos el resultado por pantalla

        if (jugador1.equals(jugador2))
            System.out.println("Empate!");

        else if (jugador1.equals("Piedra") && jugador2.equals("Tijera"))
            System.out.println("Jugador 1 gana");

        else if (jugador1.equals("Papel") && jugador2.equals("Piedra"))
            System.out.println("Jugador 1 gana!");
            
        else
            System.out.println("Jugador 2 gana!");
        
        recopilador.close();
    }
}