import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = scanner.nextDouble();
        double meters = scanner.nextDouble();
        double SecondsPerMeter = scanner.nextDouble();

        double time = meters * SecondsPerMeter;
        double slowFactor = Math.floor(meters / 15) * 12.5;
        double totalTime = time + slowFactor;
        double difference = totalTime - record;

        if (record > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }


    }
}
