import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int neededBudget = guests * 20;
        double moneyLeft = budget - neededBudget;
        double moneyForFireworkds = 0;
        double charityMoney = 0;
        if (neededBudget <= budget) {

            moneyForFireworkds = moneyLeft * 0.4;
            charityMoney = moneyLeft - moneyForFireworkds;

            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", moneyForFireworkds, charityMoney);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", neededBudget - budget);
        }
    }
}