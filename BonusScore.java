import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double Bonuspoints = 0;
        if (num % 2 == 0) {
            Bonuspoints = 1;
        } else if (num % 5 == 0) {
            Bonuspoints = 2;
        }

        if (num <= 100) {
            Bonuspoints += 5;
        } else if (num > 100 && num < 1000) {
            Bonuspoints += num * 0.2;
        } else if (num > 1000) {
            Bonuspoints += num * 0.1;
        }
        System.out.println(Bonuspoints);
        System.out.println(Bonuspoints + num);


    }
}
