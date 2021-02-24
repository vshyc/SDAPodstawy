import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);

        System.out.println("Please enter A number");
        int a = userInput1.nextInt();
        System.out.println("Please enter B number");
        int b = userInput1.nextInt();

        int sum = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        double power0f = Math.pow(a,b);
        System.out.println("dodawanie -> a = " +a +" ,b = " +b + " wynik to: " + sum);
        System.out.println("odejmowanie -> a = " +a +" ,b = " +b + " wynik to: " + d);
        System.out.println("mnożenie -> a = " +a +" ,b = " +b + " wynik to: " + e);
        System.out.println("dzielenie -> a = " +a +" ,b = " +b + " wynik to: " + f);
        System.out.println("podniesienie do potegi -> a ="+ a + ", podniesione do potegi "+b+", daje wynik "+power0f);
    }
}