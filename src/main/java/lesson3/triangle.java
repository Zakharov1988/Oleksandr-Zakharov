package lesson3;

public class triangle {
    public static void main(String[] args) {
        int a = 16;
        int b = 25;
        int c = 16;
        if ((a == b) || (a == c) || (b == c)) {
            System.out.println("трикутник рівнобiдрений");
        } else{
            System.out.println("трикутник не э рівнобiдренним");
        }
    }
}