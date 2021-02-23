import java.util.Scanner;

public class Zadanie
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = userInput.nextInt();

        System.out.println("Enter Your name");
        String s = userInput.next();

        System.out.println("You have entered : " + a + "and Your name is" + s);
    }
}
