import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = userInput.nextInt();

        for (int y = 1; y<x+1 ; y++) {
            System.out.println("To jest komunikat w pętli " + y);
        }

    }
}
