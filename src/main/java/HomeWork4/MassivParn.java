package HomeWork4;

import java.util.Arrays;

public class MassivParn {
    public static void main(String[] args) {
        int [] mas = new int[100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*1)+1;
        }
       // System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if(mas [i]%2 == 0){
                mas [i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
        }
    }
