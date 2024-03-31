public class Equation {
    float a;
    float b;

    public Equation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float calculateEquation() {
        float x;
        try {
            if (a == 0) {
                throw new ArithmeticException("Ecuatia nu este de gradul intai (a = 0)");
            }
             x = -b / a;

        } catch (ArithmeticException e) {
            System.out.println("Eroare: " + e.getMessage());
            return Float.NaN;
        } catch (Exception e) {
            System.out.println("Eroare: Introduceți coeficienți valizi.");
            return Float.NaN;
        }

       return x;
    }
}
