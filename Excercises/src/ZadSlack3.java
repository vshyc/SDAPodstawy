import java.util.Scanner;

public class ZadSlack3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj numer pętli:");
        int numerPetli = userInput.nextInt();

        int i = 0;
        while (i<numerPetli)
        System.out.println("To jest komunikat w pętli "+ i++);
    }
}
