public class Main {
    public static void main(String[] args) {
        Equation eq = new Equation(12, 8);

        float result = eq.calculateEquation();
        if (!Float.isNaN(result))
            System.out.println("Result: " + result);

    }
}