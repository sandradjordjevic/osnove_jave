package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        Random random = new Random();

        for(int i = 0; i < 8; i++) {
            int index1 = random.nextInt(10);
            int index2 = random.nextInt(10);

            int index = numbers.get(index1);
            numbers.set(index1, numbers.get(index2));
            numbers.set(index2, index);
        }
        System.out.println(numbers);
    }
}
