public class Zadanie3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 1;
        int delta = (int)Math.pow(b, 2) - 4 * (a*c);
        System.out.println(delta);
        int x = (-b - (int)Math.sqrt(delta)) / (2*a);
        System.out.println(x);
        int x2 = (-b + (int)Math.sqrt(delta)) / (2*a);
        System.out.println(x2);
        int result = a * (int)Math.pow(x, 2) + b*x + c;
        System.out.println(result);
    }
}