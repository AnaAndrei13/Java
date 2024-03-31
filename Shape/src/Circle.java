public class Circle extends Shape2D{

        private double radius;
 private String color;
        public Circle(double radius) {
            this.radius = radius;
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
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }


}
