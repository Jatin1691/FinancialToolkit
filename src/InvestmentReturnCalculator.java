public class InvestmentReturnCalculator {
    public static double calculateFutureValue(double initialInvestment, double annualRate, int years) {
        double rate = annualRate / 100;
        return initialInvestment * Math.pow(1 + rate, years);
    }
}
