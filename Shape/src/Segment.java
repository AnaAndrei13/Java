public class Segment implements Shape{

    private String color;
    private double length;


    public Segment(String color, double length) {
        this.color = color;
        this.length = length;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return length;
    }

}
