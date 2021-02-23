import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner userImput = new Scanner(System.in);

        System.out.println("Please enter a number");

        int a = userImput.nextInt();
        System.out.println("Enter your name");
        String s = userImput.next();
        System.out.println("You have entered: " + a + "and your name is " + s);
    }
}
