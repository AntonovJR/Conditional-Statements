import java.util.Scanner;

public class ExcellenOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        if (result >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent.");
        }

    }
}
