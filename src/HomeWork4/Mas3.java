package HomeWork4;import java.util.Arrays;import java.util.Random;public class Mas3 {    public static void main(String[] args) {        Random random = new Random();        int [] array = new int [20];        double sum = 0;        for (int i = 0; i < array.length; i++) {            array[i] = random.nextInt(20);            System.out.println(array[i]);        }        for (int i: array) {            sum += i;        }        System.out.print("середнє арифметичне значення всіх елементів у масиві дорiвнюе: " + sum/array.length);    }}