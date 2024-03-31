import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        Integer nr, sum;
        sum=0;
        nr = app1.readNumber();
        sum+=nr;
        nr = app1.readNumber();
        sum+=nr;

        System.out.println("Sum is :" + sum);

    }

}

