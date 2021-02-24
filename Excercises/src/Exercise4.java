//instrukcje jeżeli: if, else if, else

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = userInput.nextInt();
        if (age > 0 && age <18){
            System.out.println("You are a kid");
        }else if (age>=18 && age<65){
            System.out.println("You are adult");
        }else if (age > 65){
            System.out.println("You are senior");
        }else {
            System.out.println("You give the wrong age value");
        }
    }
}
