import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double projectHours = Double.parseDouble(scanner.nextLine());
        double availableDays = Double.parseDouble(scanner.nextLine());
        double overTimeWorkers = Double.parseDouble(scanner.nextLine());

        double workHours = Math.floor(0.9f * availableDays * 8 + overTimeWorkers * 2 * availableDays);

        double hoursLeft = workHours - projectHours;
        if (hoursLeft > 0) {
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.abs(hoursLeft));
        }
    }
}