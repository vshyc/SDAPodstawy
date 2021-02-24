import java.util.Scanner;

public class petleZad2
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj ilość wykonywanych pętli");

        int j = userInput.nextInt();
        for(int i=0; i <=j; i++)
        {
            System.out.println("to jest" + " " + i + " " + "komunikat w pętli.");
        }
    }
}
