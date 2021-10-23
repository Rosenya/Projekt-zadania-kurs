import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Wprowadź wzrost w metrach:");
        float userInput = scaner.nextFloat();
        System.out.println("Wprowadź wagę:");
        float userInput2 = scaner.nextFloat();
        float result = calculate2(userInput, userInput2);
        System.out.println("Twoje BMI to: " + result);
        if(result > 24.9 && result < 18.5){
            System.out.println("BMI prawidłowe");
        }
        else {
            System.out.println("BMI nieprawidłowe");
        }
//        switch (result){
//            case 1: (result < 18.5F);
//                System.out.println("BMI nieprawidłowe");
//            break;
//            case 2: (result > 24,9F);
//                System.out.println("BMI nieprawidłowe");
//            break;
//            case 3:
//                System.out.println("BMI prawidłowe");}


        }
    public static float calculate2(float userInput, float userInput2) {
        float BMI = (userInput2) / (float) Math.pow(userInput, 2);
        return BMI;
    }
}
