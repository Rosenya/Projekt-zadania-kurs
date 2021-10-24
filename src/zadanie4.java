import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        for(int i = 1; i <=100; ++i){
            if(i <= x){

                if(i% 3 == 0 && i%7 == 0){
                    System.out.println("Pif! Paf!");}
                else if(i%7 == 0) {
                    System.out.println("Paf!");}
                else if(i% 3 == 0){
                    System.out.println("Pif!");
                }
                else {System.out.println(i);
                }
            }

        }

    }

}
