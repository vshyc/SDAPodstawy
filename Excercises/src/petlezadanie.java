import java.util.Scanner;
public class petlezadanie {
        public static void main(String[] args) {
            Scanner UserInput = new Scanner(System.in);
            System.out.println("Podaj ilość");
            int i = UserInput.nextInt();
            for (i=0; i<5; i++) {
                System.out.println("To jest komunikat w pętli " + i);
            }
        }
    }
