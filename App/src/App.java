import java.util.InputMismatchException;
import java.util.Scanner;
//HOMEWORK.Java-1.14.Repetarea citirii unei valorii pana este intreg.
public class App {
   public int readNumber() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a integer value: ");
                return in.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Value entered is not a integer." +
                        " Please enter a integer value.");

                 in.nextLine();
            }
        }
    }
}
