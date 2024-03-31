import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        System.out.println("Sum of integers is: "+ calculateSum());
    }
    public static int  calculateSum(){
   int sum=0;
        try {
            File file = new File("D:\\temeJava\\SumOfIntegers\\src\\input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                } else {
                    scanner.next();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file not found.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
        return sum;
    }

}

