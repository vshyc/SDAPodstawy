public class petlazadanie3 {
    public static void main(String[] args) {
        int [] intTable = new int [10];
        for (int i=0; i <intTable.length; i++) {
            intTable[i] = (int) (Math.random() * 10);
        }
        for (int element:intTable) {
            System.out.println(element);
        }


        }
    }
