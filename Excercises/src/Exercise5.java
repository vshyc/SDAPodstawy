import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Poproszę hasło");
//        String password = userInput.next();
//        System.out.println("Wpisałes " + password);
//        String correctPassword = "secret";
//        if (password.toLowerCase().equals(correctPassword)){
//            System.out.println("Witaj w tajemnym miejscu");
//        }
        int[] tablica = new int[12];
        tablica[0] =(int) (Math.random()*10);
        tablica[1] = 11;
        tablica[2] = 10;

        for (int i=0 ;i < tablica.length ;i++ ) {
            System.out.print("Item in table " + tablica[i] + ",");
        }
        System.out.println("");
        for (int element:tablica) {
            System.out.print("Item in table " + element + ",");
        }

//        for (int i=0; i<3 ; i++){
//            System.out.println("Number of iteration " + i);
//            int j = 0;
//            while (j<8){
//                System.out.println(j);
//                j++;
//            }
//            System.out.println(i);
//        }

//        int i = 18;
//        do {
//            System.out.println(i);
//            i--;
//        } while ( i>8 );
    }
}
