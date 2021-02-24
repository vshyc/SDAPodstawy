import java.util.Scanner;
public class exercise4 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("please enter a number");
        int a=userInput1.nextInt();
        System.out.println("please enter b number");
        int b = userInput1.nextInt();

        int sum = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        double powerOf = Math.pow(a,b);
        System.out.println("dodawanie -> a = " +a +" ,b = " +b + " wynik to: " + (a+b));
        System.out.println("odejmowanie -> a = " +a +" ,b = " +b + " wynik to: " + (a-b));
        System.out.println("mnożenie -> a = " +a +" ,b = " +b + " wynik to: " + (a*b));
        System.out.println("dzielenie -> a = " +a +" ,b = " +b + " wynik to: " + (a/b));
        System.out.println("podniesienie do potęgi -> a = " +a +" ,b = " +b + " wynik to: " + (Math.pow(a, b)));




            }
}
