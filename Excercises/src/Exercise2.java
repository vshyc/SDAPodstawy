import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //tworzymy instancje klasy skaner w klasie main i poberamy od uzytkownika dane
        System.out.println("Please enter a number");//wprowadź numer
        int a = userInput.nextInt(); //nextInt() chcemy żeby użytkownik wprowadził Int= integer

        System.out.println("Please enter your name");//wprowadź imię
        String s = userInput.next(); //next() chcemy żeby użytkownik wprowadził string
                System.out.println("You have entered: " + a + " and your name is: " + s);
    }
}
