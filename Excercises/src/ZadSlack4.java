import java.util.Scanner;

public class ZadSlack4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wprowadz dodatnia liczbe calkowita");
        int number = userInput.nextInt();
        for (int i=1;i<=number;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}