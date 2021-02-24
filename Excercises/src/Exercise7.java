import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wprowadz liczbe wyswietlonych komunikatow");
        int numberOfIterations = userInput.nextInt();
        for (int i=1;i<=numberOfIterations;i++){
            System.out.println("To jest komunikat w pętli " + i);
        }
    }
}

