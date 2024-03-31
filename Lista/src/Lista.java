//Homework 1.18

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(56);
        numbers.add(34);
        numbers.add(120);
        numbers.add(162);
        numbers.add(712);
        numbers.add(42);

        System.out.println("Lista nesortata: ");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        Collections.sort(numbers);
        System.out.println("Lista sortată de numere întregi:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
