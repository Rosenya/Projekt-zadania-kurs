import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Wprowadź średnicę poła: ");

        float userInput = scaner.nextFloat();
        float result = calculate(userInput);
        System.out.println("Pole koła to: " + result);
    }
    public static float calculate(float diameter){
        float pole = (diameter/2) * (float)(2 * Math.PI);
        return pole;
    }


}
