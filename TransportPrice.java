import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        String time = scanner.next().toLowerCase();


        double taxirate = 0.0d;
        double price = 0.0d;
        if (time.equals("day")) {
            taxirate = 0.79;
        } else if (time.equals("night")) {
            taxirate = 0.9;
        }

        if (distance < 20) {
            price = (taxirate * distance) + 0.7;

        } else if (distance < 100) {
            price = distance * 0.09;
        } else {
            price = distance * 0.06;
        }
        System.out.println(price);


    }
}

