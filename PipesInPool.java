import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());


        double waterVolume = pipe1 * hours + pipe2 * hours;

        if (waterVolume <= poolVolume) {
            System.out.printf("The pool is %.0f%%. full." + "Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor(waterVolume / poolVolume * 100), Math.floor(pipe1 * hours / waterVolume * 100), Math.floor(pipe2 * hours / waterVolume * 100));
        } else {
            System.out.printf("For %f hours the pool" + "overflows with %f liters.", hours, waterVolume - poolVolume);
        }


    }

}

