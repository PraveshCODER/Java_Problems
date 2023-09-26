import java.util.Scanner;

public class LoanApprovalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit score (300-850): ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter your annual income: $");
        double income = scanner.nextDouble();

        System.out.print("Enter the loan amount: $");
        double loanAmount = scanner.nextDouble();

        scanner.close();

        boolean isLoanApproved = checkLoanEligibility(creditScore, income, loanAmount);

        if (isLoanApproved) {
            System.out.println("Congratulations! Your loan of $" + loanAmount + " is approved.");
            System.out.println("You will receive the loan terms shortly.");
        } else {
            System.out.println("Sorry, your loan application is denied.");
            System.out.println("Please review your financial situation and try again later.");
        }
    }

    private static boolean checkLoanEligibility(int creditScore, double income, double loanAmount) {
        // Define eligibility criteria (example criteria)
        return (creditScore >= 700) && (income >= 50000) && (loanAmount <= 200000);
    }
}
