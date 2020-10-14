import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double movieBudget = scanner.nextDouble();
        double actors = scanner.nextDouble();
        double actorsCloths = scanner.nextDouble();


        double decorPrice = movieBudget * 0.1;
        double priceForActorsClothes = actors * actorsCloths;
        if (actors > 150) {
            priceForActorsClothes = (actors * actorsCloths) * 0.9;
        }

        double totalPriceForTehMovie = decorPrice + priceForActorsClothes;

        double total = Math.abs(movieBudget - totalPriceForTehMovie);

        if (totalPriceForTehMovie > movieBudget) {


            System.out.print("Not enough money!");
            System.out.printf("%nWingard needs %.2f leva more.", total);
        } else if (decorPrice + priceForActorsClothes <= movieBudget) {


            System.out.print("Action!");
            System.out.printf("%nWingard starts filming with %.2f leva left.", total);


        }

    }


}



