import java.util.Scanner;

public class Excercise2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your a text");

        String userText = userInput.nextLine();

        System.out.println("You have entered : " + userText);

        System.out.println("Lenght of text is: " + userText.length());
        System.out.println("Text is empty :" + userText.isEmpty());

        System.out.println(userText.toLowerCase());
        System.out.println(userText.toUpperCase());
        System.out.println("The text contains your name: " + userText.contains("Iwona"));
        System.out.println(userText.indexOf("iwona"));
        System.out.println(userText.lastIndexOf("iwona"));
        System.out.println(userText.substring(5));
        System.out.println(userText.equals("iwona"));
        System.out.println(userText.split(" "));
        System.out.println(userText.replace(" ", "."));
    }
}


