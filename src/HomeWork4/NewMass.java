package HomeWork4;

import java.util.Arrays;
import java.util.Random;

public class NewMass {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int [100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 ==0) {
                array [i] = 0;
            }
            System.out.println(array[i]);
        }
    }
}