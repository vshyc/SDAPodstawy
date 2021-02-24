import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Poproszę hasło");
        String password = userInput.next();
        System.out.println("Wpisałes " + password);
        String correctPassword = "secret";
        if (password.toLowerCase().equals(correctPassword)){
            System.out.println("Witaj w tajemnym miejscu");
        }
        int[] tablica =new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("First iten i table " + tablica[0]);

    }
}