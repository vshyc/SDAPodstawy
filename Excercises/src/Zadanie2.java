import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wprowadź liczbę komunikatów ");
        int numberOfInterations = userInput.nextInt();

        for (int i = 1; i <= numberOfInterations; i++) {
            System.out.println("To jest komunikat w pętli " + i);
        }
    }
}
