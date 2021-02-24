import java.util.Scanner;

public class petleZad3
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą");

        int i = userInput.nextInt();

        for(int j = 1; j <i; j = j+2)
        {
            System.out.println(j);
        }
    }
}

//for(int j = 1; j<=i; i++)
//    if(j%==1)
