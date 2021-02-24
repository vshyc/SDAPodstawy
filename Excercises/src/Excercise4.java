public class Excercise4 {
    public static void main(String[] args) {

        int age = 12;
        if (age > 0 && age < 18) {
            System.out.println("niepelnoletni");
        } else if (age > 18 && age < 65) {
            System.out.println("dorosly");
        } else if (age > 65) {
            System.out.println("senior");
        } else {
            System.out.println("warunek nieprawidlowy");
        }


        int UserImput = 2;
        switch (UserImput) {
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;

        }
    }
}
