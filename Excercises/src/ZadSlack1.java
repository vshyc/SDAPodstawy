import java.util.Scanner;

public class ZadSlack1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = userInput.nextInt();
        System.out.println("Enter second number:");
        int b = userInput.nextInt();

        int sum = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int pwr = (int) Math.pow(a,b);
        System.out.println("dodawanie -> a = " +a +", b = " +b + " wynik to: " + sum);
        System.out.println("odejmowanie -> a = " +a +", b = " +b + " wynik to: " + d);
        System.out.println("mnożenie -> a = " +a +", b = " +b + " wynik to: " + e);
        System.out.println("dzielenie -> a = " +a +", b = " +b + " wynik to: " + f);
        System.out.println("podniesienie do potęgi -> a="+a + " podniesione do potęgi "+b + " daje wynik "+pwr);

    }
}

