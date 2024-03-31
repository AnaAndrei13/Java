import static java.lang.Math.pow;

public  class Cube extends Shape3D {
    private double side;
    private String color;

    public Cube(double side) {
       this.side=side;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double  getVolume(){
        return pow(side,3);
    }

   public  double getPerimeter(){
        return -1;
    }
}
