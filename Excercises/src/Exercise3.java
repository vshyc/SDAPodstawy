import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = userInput.nextInt();

        if (age>0 && age<18) {
            System.out.println("underage");
        } else if (age>=18 && age<65) {
            System.out.println("adult");
        } else if (age>=65) {
            System.out.println("senior");
        } else {
            System.out.println("the value is wrong");
        }
    }

    int userInput = 2;

}
