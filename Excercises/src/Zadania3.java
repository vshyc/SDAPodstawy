import java.util.Scanner;

public class Zadania3 {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
       System.out.println("Enter a number");
       int number;
       int remainder;
        System.out.println("Give a number");
        number= userInput.nextInt();

        for(int i = 1 ; i<number;i++){
            remainder=i % 2;
            if(remainder >0){
                System.out.println("Odd number"+i);
            }
        }





    }
}
