package HomeWork4;

public class testt3 {
    public static void main(String[] args) {
        int num [] = {5, 8, 12, -18, -54, 84, -35, 17, 37};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/num.length);
    }
}
