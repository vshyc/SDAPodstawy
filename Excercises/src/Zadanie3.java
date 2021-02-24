import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number;
        int remainder;

        System.out.println("Podaj liczbę: ");
        number = userInput.nextInt();

        for (int i = 1; i < number; i++) {
            remainder = i % 2;
            if (remainder > 0) {
                System.out.println("Liczba nieparzysta: " + i);
            }
        }
    }
}
