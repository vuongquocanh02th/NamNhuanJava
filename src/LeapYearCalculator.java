import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is leap year", year);
                } else {
                    System.out.printf("%d is not leap year", year);
                }
            } else {
                System.out.printf("%d is leap year", year);
            }
        } else {
            System.out.printf("%d is not leap year", year);
        }
    }
}
