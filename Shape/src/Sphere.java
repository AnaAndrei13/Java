public class Sphere extends Shape3D{
    private double radius;
private String color;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getPerimeter() {
        // Nu este definit perimetrul pentru o sferă
        return -1;
    }
}
