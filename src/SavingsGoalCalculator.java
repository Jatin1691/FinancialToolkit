public class SavingsGoalCalculator {
    public static double calculateMonthlySavings(double goalAmount, double annualRate, int years) {
        double monthlyRate = annualRate / 100 / 12;
        int totalPayments = years * 12;
        return goalAmount * monthlyRate / (Math.pow(1 + monthlyRate, totalPayments) - 1);
    }
}
