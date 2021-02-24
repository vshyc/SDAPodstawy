import java.util.Scanner;
public class petle_slack3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wpisz dowolną dodatnią liczbę całkowitą");
        int a = userInput.nextInt();
        for (int i = 1; i < a; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
