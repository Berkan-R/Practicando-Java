public class StringEntero {

    /*
     * We need a function that can transform a string into a number. What ways of
     * achieving this do you know?
     * 
     * Note: Don't worry, all inputs will be strings, and every string is a
     * perfectly valid representation of an integral number.
     */

    static int stringNumero(String texto) {
        return Integer.parseInt(texto);
    }

    public static void main(String[] args) {
        System.out.println(stringNumero("1234"));
        System.out.println(stringNumero("605"));
        System.out.println(stringNumero("1405"));
        System.out.println(stringNumero("-7"));
    }
}