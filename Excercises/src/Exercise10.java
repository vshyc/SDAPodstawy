//zadanie2

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Podaj liczbę komunikatów:");
        int j = UserInput.nextInt();
        for ( int i=0; i<j; i++) {
            System.out.println("To jest komunikat w pętli " + i);
        }
    }
}
