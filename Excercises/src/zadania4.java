public class zadania4 {
    public static void main(String[] args) {
        int[]intTable=new int[10];
        for(int i=0; i<intTable.length;i++){
            intTable[i]= 10-(int) (Math.random()*10);
            }
        for(int element:intTable) {
            System.out.println(element);
        }
        System.out.println("The minimal value of table is:+");



    }
}
