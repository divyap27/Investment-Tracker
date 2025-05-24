import java.util.Scanner;

public class Tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your buying price per share: ");
        double buyingPrice = scanner.nextDouble();

        int day = 1;
        double closingPrice;
        double[] weekly = new double[7];

        int i = 0;
        while (i < weekly.length) {
            System.out.print("Enter the closing price for day " + day + ": ");
            closingPrice = scanner.nextDouble();
            double earnings = closingPrice - buyingPrice;

            weekly[i] = earnings;

            if (earnings > 0) {
                System.out.printf("After day " + day + ", you have gained $%.2f per share since yesterday.\n", earnings);
            } else if (earnings < 0) {
                System.out.printf("After day " + day + ", you have lost $%.2f per share since yesterday.\n", -earnings);
            } else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }

            day++;
            i++;
        }

        System.out.println("\nYour weekly earnings:");
        double totalWeeklyEarnings = 0;

        for (int j = 0; j < weekly.length; j++) {
            System.out.printf("Your earning on day " + (j + 1) + " is $%.2f\n", weekly[j]);
            totalWeeklyEarnings += weekly[j];
        }

        System.out.printf("Total earnings: $%.2f per share\n", totalWeeklyEarnings);

        scanner.close();
    }
}
