import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number 0 or above: ");
        int numberOfIterations = userInput.nextInt();

        for (int i=1; i<=numberOfIterations;i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
