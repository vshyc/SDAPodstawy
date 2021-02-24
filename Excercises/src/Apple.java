public class Apple {
    private String color;
    private int size;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Apple() {
        this.color = "";
        this.size = 0;
    }
    public Apple(String color, int size) {
        this.color = color;
        this.size = size;
    }
    public void rot(){
        System.out.println("This apple is rotten");
    }


}