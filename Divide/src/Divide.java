
public class Divide {
  public void Dividex(int x) {
   int number;
   try {
       number = 10 / x;

   } catch (ArithmeticException e) {
             System.out.println("Divide by 0" );
             number = 0;
              e.printStackTrace();

   } catch (Exception e) {
             number = -1;
             System.out.println("General error");
             e.printStackTrace();}

   System.out.println(number);
  }

}
