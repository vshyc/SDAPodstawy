import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = userInput.nextInt();
        if (age>0 && age<18) {
            System.out.println("underage");
        }else if (age>=18 && age<65){
            System.out.println("adult");
        }else if (age>=65){
            System.out.println("senior");
        }else {
            System.out.println("the value is wrong");
        }

        switch (age){
            case 1:
                System.out.println("the number is one");
                break;
            case 2:
                System.out.println("the number is two");
                break;
            case 3:
                System.out.println("the number is three");
                break;
            case 4:
                System.out.println("the number is four");
                break;
            default:
                System.out.println("The number is out of range");
        }
    }
}
