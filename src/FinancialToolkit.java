import java.util.Scanner;

public class FinancialToolkit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    handleMortgageCalculator(scanner);
                    break;
                case 2:
                    handleInvestmentReturnCalculator(scanner);
                    break;
                case 3:
                    handleSavingsGoalCalculator(scanner);
                    break;
                case 4:
                    handleIncomeTaxCalculator(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the toolkit. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("Select a calculator:");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Investment Return Calculator");
        System.out.println("3. Savings Goal Calculator");
        System.out.println("4. Income Tax Calculator (Optional)");
        System.out.println("5. Exit");
    }

    private static void handleMortgageCalculator(Scanner scanner) {
        System.out.println("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate (as a percentage): ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        double monthlyPayment = MortgageCalculator.calculateMonthlyPayment(loanAmount, annualRate, loanTermYears);
        System.out.println("Monthly mortgage payment: " + monthlyPayment);
    }

    private static void handleInvestmentReturnCalculator(Scanner scanner) {
        System.out.println("Enter initial investment: ");
        double initialInvestment = scanner.nextDouble();

        System.out.println("Enter expected annual rate of return (as a percentage): ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter investment time horizon (in years): ");
        int years = scanner.nextInt();

        double futureValue = InvestmentReturnCalculator.calculateFutureValue(initialInvestment, annualRate, years);
        System.out.println("Future value of the investment: " + futureValue);
    }

    private static void handleSavingsGoalCalculator(Scanner scanner) {
        System.out.println("Enter savings goal amount: ");
        double goalAmount = scanner.nextDouble();

        System.out.println("Enter expected annual rate of return (as a percentage): ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter time frame (in years): ");
        int years = scanner.nextInt();

        double monthlySavings = SavingsGoalCalculator.calculateMonthlySavings(goalAmount, annualRate, years);
        System.out.println("Monthly savings required: " + monthlySavings);
    }

    private static void handleIncomeTaxCalculator(Scanner scanner) {
        System.out.println("Enter annual income: ");
        double annualIncome = scanner.nextDouble();

        System.out.println("Enter deductions: ");
        double deductions = scanner.nextDouble();

        System.out.println("Enter filing status (single/married): ");
        String filingStatus = scanner.next();

        System.out.println("Enter tax credits: ");
        double taxCredits = scanner.nextDouble();

        double taxLiability = IncomeTaxCalculator.calculateTaxLiability(annualIncome, deductions, filingStatus, taxCredits);
        System.out.println("Estimated tax liability: " + taxLiability);
    }
}
