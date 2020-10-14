import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double incomeBGN = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());
        double success = 0.0;
        double scholarship = 0.0;

        if (incomeBGN < minWage) {
            if (averageGrade >= 5.50) {
                scholarship = averageGrade * 25;
                success = minWage * 0.35;
            } else if (averageGrade >= 4.50) {
                success = minWage * 0.35;
            }
        } else {
            if (averageGrade >= 5.50) {
                scholarship = averageGrade * 25;
            }
        }
        if (success == 0 && scholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (success > scholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(success));
        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarship));
        }
    }
}