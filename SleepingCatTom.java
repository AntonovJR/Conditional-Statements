import java.io.PrintStream;
import java.util.Scanner;

public class SleepingCatTom {
    public static void main(String[] args) {

        int OneYearDays = 365;
        int NeededGameMinutes = 30000;
        int MinutesForGameInWorkingDay = 63;
        int MinutesForGameInDayOff = 127;
        Scanner scanner = new Scanner(System.in);
        int DaysOff = Integer.parseInt(scanner.nextLine());
        int workingDays = OneYearDays - DaysOff;
        int realGameMinutes = workingDays * MinutesForGameInWorkingDay + DaysOff * MinutesForGameInDayOff;
        int hours = Math.abs(NeededGameMinutes - realGameMinutes) / 60;
        int minutes = Math.abs(NeededGameMinutes - realGameMinutes) % 60;

        if (NeededGameMinutes >= realGameMinutes) {


            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(hours), Math.floor(minutes));
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(hours), Math.floor(minutes));
        }
    }
}
