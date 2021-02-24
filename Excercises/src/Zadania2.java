import java.util.Scanner;

public class Zadania2 {
    public static void main(String[] args) {
        Scanner messagesCount=new Scanner(System.in);
        System.out.println("Ile komunikatów wyświetlić?");
        int last= messagesCount.nextInt();
        for(int i =0;i<last;i++){
            System.out.println("To jest"+ i + "komunikt w pętli");
        }
    }
}
