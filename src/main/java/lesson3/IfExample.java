package lesson3;

public class IfExample {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("BEFORE If");

        if (flag) {
            System.out.println("INSIDE If");
            System.out.println("INSIDE If - 2");
        }

        System.out.println("After If");
    }
}
