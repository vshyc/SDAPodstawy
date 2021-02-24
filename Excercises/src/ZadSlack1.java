import java.util.Scanner;

public class ZadSlack1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = userInput.nextInt();
        System.out.println("Enter second number:");
        int b = userInput.nextInt();
        System.out.println("Enter an operation(+,-,*,/,pwr):");
        String o = userInput.next();

        if (o.equals("+")) {
            int sum = a + b;
            System.out.println("Wynik to: " + (a+b));
        }else if (o.equals("-")) {
            System.out.println("Wynik to: " + (a-b));
        }else if (o.equals("*")) {
            System.out.println("Wynik to: " + (a*b));
        }else if (o.equals("/")) {
            System.out.println("Wynik to: " + (a/b));
        }else if (o.equals("pwr")){
            System.out.println("Wynik to: " + (Math.pow(a,b)));
        }else {
            System.out.println("Błąd.");
        }



    }
}

