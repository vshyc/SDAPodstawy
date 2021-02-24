import java.util.Arrays;

public class zadanie4 {

    public static void main(String[] args) {
        int[] intTable = new int[10];

        for (int i=0; i<intTable.length ; i++){
            intTable[i] = 10 - (int) (Math.random()*20);
    }
        for (int element:intTable) {
            System.out.println(element);
        }
        System.out.println("The minimal value of the table is: " + Arrays.stream(intTable).min());
        System.out.println("The maximal value of the table is: " + Arrays.stream(intTable).max());
        }
}
