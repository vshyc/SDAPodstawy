import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
      Scanner userInput=new Scanner(System.in);
      System.out.println(("Wprowadź liczbe wyswietlanych komunikatow"));
      int numberOfIterations= userInput.nextInt();

      for(int i=1;i<=numberOfIterations;i++){
          if(i%2==1)
          System.out.println(i);
      }
  }
}