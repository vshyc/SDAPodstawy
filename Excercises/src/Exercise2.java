import java.sql.SQLOutput;
import java.util.Scanner;


public class Exercise2 {

    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your text");
        String userText = userInput.nextLine();
        System.out.println("You have entered: " +userText);
        System.out.println("Lenght of text is: " +userText.length());
        System.out.println("Text is empty: " + userText.isEmpty());
        System.out.println(userText.toLowerCase());
        System.out.println(userText.toUpperCase());
        System.out.println("The text caontains your name: " +userText.toLowerCase().contains("adrian"));
        System.out.println(userText.indexOf("adrian"));
        System.out.println(userText.lastIndexOf("adrian"));
        System.out.println(userText.toLowerCase().substring(5));
        System.out.println(userText.toLowerCase().equals("adrian"));
        System.out.println(userText.split(""));
        System.out.println();
            }
        }


