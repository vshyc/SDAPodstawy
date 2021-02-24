import java.util.Arrays;
public class cw4 {
    public static void main(String[] args) {
        int[] intTable = new int[10];
        for (int i=0; i<intTable.length;i++){
            intTable[i] = 10 - (int) (Math.random()*20);
        }
        for (int element:intTable) {
            System.out.println(element);
        }
        System.out.println("The minimal value of table is: " + Arrays.stream(intTable).min());
        System.out.println("The max value of table is: " + Arrays.stream(intTable).max());
    }
}