import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == b && a == c && b == c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }

}
