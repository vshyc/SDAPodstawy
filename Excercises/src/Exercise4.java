import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your text");
        String userText = userInput.nextLine();
        System.out.println("You have entered: " + userText);

        System.out.println("Length of text is: " + userText.length());
        System.out.println("Text is empty: " + userText.isEmpty());
        System.out.println(userText.toLowerCase());
        System.out.println(userText.toUpperCase());
    }
}
