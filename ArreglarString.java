public class ArreglarString {

    static String arreglo(String str) {

        int mayusculas = 0;
        int minusculas = 0;
        String solucion = "";

        for (int contador = 0; contador < str.length(); contador++) {

            if (65 <= str.charAt(contador) && str.charAt(contador) <= 90) {
                mayusculas++;
            }

            else {
                if (97 <= str.charAt(contador) && str.charAt(contador) <= 122) {
                    minusculas++;
                }
            }
        }

        if (mayusculas > minusculas) {
            solucion = solucion + str.toUpperCase();

        } else
            solucion = solucion + str.toLowerCase();

        return solucion;
    }

    public static void main(String[] args) {
        System.out.println(arreglo("Hola"));
        arreglo("QueTAL");
    }
}