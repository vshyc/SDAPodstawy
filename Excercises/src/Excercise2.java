import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner userImput = new Scanner(System.in);
        System.out.println("Please enter the number");

        int a= userImput.nextInt();
        String s= userImput.next();
        System.out.println("You have entered:" + a + "and your name is" + s);


    }
}
