import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a name");

        String userText = userInput.nextLine();

        System.out.println("Your name is " + userText );

        System.out.println("Lenght of text is: " + userText.length() + " letters.");
        System.out.println("Text is this field empty? " + userText.isEmpty());

        System.out.println(userText.toLowerCase());
        System.out.println(userText.toUpperCase());

        System.out.println("The text contains your name: " + userText.toLowerCase().contains("darek"));
    }
}
