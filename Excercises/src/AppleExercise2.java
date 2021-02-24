public class AppleExercise2 {
    public static void main(String[] args) {
        Apple firstApple = new Apple();
        Apple secondApple = new Apple("red",8);
        firstApple.setColor("green");
        System.out.println(secondApple.getColor());
        secondApple.setColor("purple");
        System.out.println(firstApple.getColor());
        System.out.println(secondApple.getColor());
        firstApple.rot();
    }
}
