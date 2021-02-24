import java.util.Scanner;

public class cwiczeniaZeSlacka {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter A number: ");
        int a = userInput.nextInt();

        System.out.println("Please enter B number: ");
        int b = userInput.nextInt();

        int sum = a+b;
        System.out.println("Dodawanie: a = " + a + ", b = " + b + ". Wynik to " + sum + "." );

        int d = a-b;
        System.out.println("Odejmowanie: a = " + a + ", b = " + b + ". Wynik to " + d + "." );

        int e = a*b;
        System.out.println("Mnożenie: a = " + a + ", b = " + b + ". Wynik to " + e + "." );

        int f = a/b;
        System.out.println("Dzielenie: a = " + a + ", b = " + b + ". Wynik to " + f + "." );

        int g = (int) Math.pow(a, b);
        System.out.println("Potęga: a = " + a + ", b = " + b + ". Wynik to " + g + "." );

    }
}
