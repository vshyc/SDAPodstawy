import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        int age = 21;
        if (age>0 && age<18) {
            System.out.println("Underage");
        }else if (age>18 && age<65) {
            System.out.println("Adult");
        }else if (age>=65) {
            System.out.println("Senior");
        }else {
            System.out.println("The value is wrong");

        }
        int userInput = 2;
        switch (userInput) {
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

