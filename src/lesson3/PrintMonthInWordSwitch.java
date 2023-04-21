package lesson3;
public class PrintMonthInWordSwitch {
    public static void main(String[] args) {
    int months = 13;
    switch (months) {
        case 1:
            System.out.println("JAN");
            break;
        case 2:
            System.out.println("FEB");
            break;
        case 3:
            System.out.println("Mar");
            break;
        case 4:
            System.out.println("Apr");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("Jul");
            break;
        case 8:
            System.out.println("Aug");
            break;
        case 9:
            System.out.println("Sept");
            break;
        case 10:
            System.out.println("Oct");
            break;
        case 11:
            System.out.println("Nov");
            break;
        case 12:
            System.out.println("Dec");
            break;
        default:
            System.out.println("Not a valid month");
    }
    }
}
