import java.util.Arrays;

public class tablice_slack1 {
    public static void main(String[] args) {
        int [] tablica = new int [10];
        for (int i=0; i<tablica.length; i++){
            tablica[i] = 10 - (int) (Math.random()*20);
        }
        for (int element:tablica){
            System.out.println(element);
        }
        System.out.println("Minimalna wartośćw tablicy wynosi: " + Arrays.stream(tablica).min());
        System.out.println("Maksymalna wartość w tablicy wynosi: " + Arrays.stream(tablica).max());
    }
}
