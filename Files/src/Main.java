public class Main {
    public static void main(String[] args) {
        System.out.println("Number from file is: "+ Files.readFromFile());
        System.out.println("Calculated value is : " + Files.calculateValue());
    }

}
