import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next().toLowerCase();

        switch (type) {
            case "triangle": {
                double a = scanner.nextDouble();
                double h = scanner.nextDouble();
                double area = (a * h / 2.00);
                System.out.printf("%.3f", area);

                break;
            }
            case "square":
            case "rectangle": {
                double firstSide = scanner.nextDouble();
                double secondSide = scanner.nextDouble();
                double area = firstSide * secondSide;
                System.out.printf("%.3f", area);

                break;
            }
            case "circle":
                double r = scanner.nextDouble();
                double areaCircle = Math.PI * r * r;
                System.out.printf("%.3f", areaCircle);

                break;
        }

    }
}
