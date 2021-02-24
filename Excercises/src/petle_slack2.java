import java.util.Scanner;
public class petle_slack2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wskaż ile komunikatów chcesz wyświetlić");
        int a = userInput.nextInt();
        for (int i=0; i<a; i++){
            System.out.println("To jest komunikat w pętli " + i);
        }
    }
}