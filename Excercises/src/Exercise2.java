import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int a = userInput.nextInt();

        System.out.println("Please enter a name");
        String s = userInput.next();

        System.out.println("You have entered: " + a + " and your name is " + s + ". \n Lovely, right?");
    }
}
