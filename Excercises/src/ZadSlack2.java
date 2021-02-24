import java.util.Scanner;

public class ZadSlack2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Poproszę hasło:");
        String password = userInput.next();
        System.out.println("Wpisano: "+password);
        String correctPassword = "secret";

        if (password.equals(correctPassword)){
            System.out.println("Witaj w tajemnym miejscu");

        }
    }
}
