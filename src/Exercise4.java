import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj pierwszą A liczbę całkowitą");
        int a = userInput.nextInt();
        System.out.println("Podaj drugą B liczbę całkowitą");
        int b = userInput.nextInt();
        System.out.println("Podaj działanie \n1.sum + \n2.diff - \n3.multi * \n4.div : \n5.exp ^ \n");
        int action = userInput.nextInt();
        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        double div = a / b;
        double exp = Math.pow(a, b);
        switch (action) {
            case 1:
                System.out.println("dodawanie -> a = " + a + " ,b = " + b + " wynik to: " + sum);
                break;
            case 2:
                System.out.println("odejmowanie -> a = " + a + " ,b = " + b + " wynik to: " + diff);
                break;
            case 3:
                System.out.println("mnożenie -> a = " + a + " ,b = " + b + " wynik to: " + multi);
                break;
            case 4:
                System.out.println("dzielenie -> a = " + a + " ,b = " + b + " wynik to: " + div);
                break;
            case 5:
                System.out.println("podniesienie do potęgi -> a = " + a + " ,b = " + b + " wynik to: " + exp);
                break;
        }
    }
}
