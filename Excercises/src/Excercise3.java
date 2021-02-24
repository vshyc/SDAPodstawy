import java.util.Locale;
import java.util.Scanner;

public class Excercise3 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your text");
        String userText = userInput.nextLine();
        System.out.println("You have entered : " + userText);
        System.out.println("Length of text:" + userText.length());
        System.out.println("Text is empty: " + userText.isEmpty());
        System.out.println(userText.toLowerCase(Locale.ROOT));
        System.out.println("The text contains your name: " + userText.contains("Arek"));
        System.out.println(userText.indexOf("Arek"));
        System.out.println(userText.lastIndexOf("Arek"));
        System.out.println(userText.substring(5));
        System.out.println(userText.equals("Aarek"));

    }
}