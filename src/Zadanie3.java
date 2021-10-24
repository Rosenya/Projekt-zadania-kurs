public class Zadanie3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 1;
        double delta = Math.pow(b, 2) - 4 * (a*c);
        System.out.println(delta);
        double x = (-b - Math.sqrt(delta)) / (2*a);
        System.out.println(x);
        double x2 = (-b + Math.sqrt(delta)) / (2*a);
        System.out.println(x2);
        double result = a * Math.pow(x, 2) + b*x + c;
        System.out.println(result);
    }
}