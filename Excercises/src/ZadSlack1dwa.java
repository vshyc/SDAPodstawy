import java.util.Scanner;

public class ZadSlack1dwa {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = userInput.nextInt();
        System.out.println("Enter second number:");
        int b = userInput.nextInt();
        System.out.println("Enter an operation(+,-,*,/,pwr):");
        String o = userInput.next();

        switch (o) {
            case "+":
            System.out.println("Wynik to: " + (a+b));
                break;
            case "-":
            System.out.println("Wynik to: " + (a-b));
                break;
            case "*":
            System.out.println("Wynik to: " + (a*b));
                break;
            case "/":
            System.out.println("Wynik to: " + (a/b));
                break;
            case "pwr":
            System.out.println("Wynik to: " + (Math.pow(a,b)));
                break;
            default:
                System.out.println("Błąd");
        }



}}

