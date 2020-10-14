import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int last = scanner.nextInt();

        int total = first + second + last;

        int mins = 0;
        if (total > 59 && total <= 119) {
            mins++;
            total -= 60;
        } else if (total > 120) {
            mins += 2;
            total -= 120;
        }
        System.out.printf("%d:%02d", mins, total);


    }
}
