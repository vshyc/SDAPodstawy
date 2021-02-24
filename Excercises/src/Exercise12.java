//zadnie4

import java.util.Arrays;

public class Exercise12 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int  i = 0; i<tablica.length; i++) {
            tablica[i] = 10 - (int) (Math.random()*20);
        }
        System.out.print("Wartości tablicy: [ ");
        for (int element:tablica) {
            System.out.print(element + ", ");
        }
        System.out.println("] ");
        System.out.println("Minimalna wartość w tablicy to: " + Arrays.stream(tablica).min());
        System.out.println("Maksymalna wartość w tablicy to: " + Arrays.stream(tablica).max());
    }
}
