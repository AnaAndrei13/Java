public class Main {
    public static void main(String[] args) {
        Cube cub = new Cube(3.3);
        double volume = cub.getVolume();
        System.out.println("Volumul cubului este: " + volume);
        Circle circle=new Circle(2);
        System.out.println("Aria cercului este: " + circle.getArea());
    }
}
