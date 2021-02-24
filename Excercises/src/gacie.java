import java.util.Scanner;
public class gacie {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your text");
        String userText = userInput.nextLine();
        System.out.println("You have entered: " + userText);
        System.out.println("Length of text is: " + userText.length());
        System.out.println("Text is empty: " + userText.isEmpty());
        System.out.println(userText.toLowerCase());
        System.out.println(userText.toUpperCase());
        System.out.println("The text contains yout name: " + userText.toLowerCase().contains("darek"));
        System.out.println(userText.indexOf("darek"));
        System.out.println(userText.lastIndexOf("darek"));
        System.out.println(userText.substring(5));
        System.out.println(userText.equals("darek"));
    }
}
