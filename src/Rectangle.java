public class Rectangle {

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calculateAria() {
        return this.height * this.length;
    }

    public static int sumArias(Rectangle ... rectangles) {
        int sum = 0;
        for(Rectangle r : rectangles) {
            sum += r.calculateAria();
        }
        return sum;
    }
}
