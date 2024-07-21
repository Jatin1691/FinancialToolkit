public class MortgageCalculator {
    public static double calculateMonthlyPayment(double loanAmount, double annualRate, int loanTermYears) {
        double monthlyRate = annualRate / 100 / 12;
        int totalPayments = loanTermYears * 12;
        return loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalPayments) /
                (Math.pow(1 + monthlyRate, totalPayments) - 1);
    }
}
