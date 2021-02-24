//zadanie3

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą:");
        int j = UserInput.nextInt();
        for (int i = 1; i <= j; i++) {
            if (i % 2 !=0) {
                System.out.print( i + " ");
            }
        }
    }
}


