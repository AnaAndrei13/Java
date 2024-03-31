//Homework-1.22

import java.util.InputMismatchException;
import java.util.Scanner;

public class Suma {
    public Integer number1=null;
    public Integer number2=null;
    public Integer suma=null;

     public void calculateSum() {
         Scanner scanner = new Scanner(System.in);

         try {
             System.out.println("Enter first number: ");
             number1 = scanner.nextInt();
         } catch (InputMismatchException e) {
             System.out.println("You did not enter a valid integer for the first number");
             number1 = null;
         }
         try {
             System.out.println("Enter second number: ");
             number2 = scanner.nextInt();
         } catch (InputMismatchException e) {
             System.out.println("You did not enter a valid integer for the second number");
             number2 = null;
         }
         if (number1 != null && number2 != null) {
             suma = number1 + number2;
             System.out.println("Suma is: " + suma);
         } else
             System.out.println("The sum couldn't be calculated due to an input error");


     }

}
