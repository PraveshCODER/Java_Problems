import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Future Value Calculator");
        
        System.out.print("Enter your initial investment: $");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(initialInvestment, interestRate, years);

        System.out.printf("After %d years, your initial investment of $%.2f will grow to $%.2f.%n", years, initialInvestment, futureValue);

        scanner.close();
    }

    public static double calculateFutureValue(double initialInvestment, double interestRate, int years) {
        // Formula to calculate future value: FV = P(1 + r)^t
        double futureValue = initialInvestment * Math.pow(1 + interestRate, years);
        return futureValue;
    }
}
