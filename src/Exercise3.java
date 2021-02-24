public class Exercise33 {
import java.util.Scanner;
public class Exercise33 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number 1:4");
        int number = userInput.nextInt();
        switch (number) {
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;
            case 4:
                System.out.println("The number is four");
                break;
            default:
                System.out.println("The number is out of range");
        }
    }
}