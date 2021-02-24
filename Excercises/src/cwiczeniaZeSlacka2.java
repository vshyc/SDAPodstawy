import java.util.Scanner;

public class cwiczeniaZeSlacka2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Poproszę o hasło:");
        String password = userInput.next();
        System.out.println("Wpisałeś " + password);
        String correctPassword = "secret";
        if (password.equals(correctPassword)) {
            System.out.println("Witamy w tajemniczym miejscu!");
        }else
            {
                System.out.println("Nieprawidłowe hasło.");
         }

    }
}
