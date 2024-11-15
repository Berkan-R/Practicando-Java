public class CalcularIMC {

    /*
     * Write function bmi that calculates body mass index (bmi = weight / height2).
     * 
     * if bmi <= 18.5 return "Underweight"
     * if bmi <= 25.0 return "Normal"
     * if bmi <= 30.0 return "Overweight"
     * if bmi > 30 return "Obese"
     */

    static String imc(double peso, double altura) {

        double calculoIMC = peso / (altura * altura);

        if (calculoIMC <= 18.5) {
            return "Underweight";

        } else if (calculoIMC <= 25) {
            return "Normal";

        } else if (calculoIMC <= 30) {
            return "Overweight";

        } else
            return "Obese";
    }

    public static void main(String[] args) {

        System.out.println(imc(50, 1.8));
        System.out.println(imc(80, 1.8));
        System.out.println(imc(90, 1.8));
        System.out.println(imc(100, 1.8));
    }
}