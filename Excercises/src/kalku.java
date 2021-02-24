import java.util.Scanner;
public class kalku {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("PLease enter A number");
        int a = userInput.nextInt();
        System.out.println("Please enter B number");
        int b = userInput.nextInt();
        int sum = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        double powerOf = Math.pow(a,b);

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Wybierz rodzaj działania: (dodawanie / odejmowanie / mnożenie / dzielenie / potęga).");
        String dzialanie = userInput2.nextLine();

        switch (dzialanie) {
            case "dodawanie":
                System.out.println("dodawanie -> a = " + a + " ,b = " + b + " wynik to: " + sum);
                break;
            case "odejmowanie":
                System.out.println("odejmowanie -> a = " + a + " ,b = " + b + " wynik to: " + d);
                break;
            case "mnożenie":
                System.out.println("mnożenie -> a = " + a + " ,b = " + b + " wynik to: " + e);
                break;
            case "dzielenie":
                System.out.println("dzielenie -> a = " + a + " ,b = " + b + " wynik to: " + f);
                break;
            case "potęga":
                System.out.println("podniesienie do potęgi -> a =" + a + ", podniesione do potęgi " + b + ", daje wynik " + powerOf);
                break;
        }
    }
}