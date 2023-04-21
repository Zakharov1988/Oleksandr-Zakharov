package lesson3;

public class Math1 {
    public static void main(String[] args) {
        int a = 3;
        int b = -9;
        Math.abs(a);
        Math.abs(b);

        if (Math.abs(a) < Math.abs(b)){
        System.out.println(Math.abs(b));}
        else if (Math.abs(a) > Math.abs(b)) {
            System.out.println(Math.abs(a));
        }
    }
    }