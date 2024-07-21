public class IncomeTaxCalculator {
    public static double calculateTaxLiability(double annualIncome, double deductions, String filingStatus, double taxCredits) {
        double taxableIncome = annualIncome - deductions;
        double taxLiability = 0.0;

        double[][] taxSlabs = {
                {0, 9950, 0.10},
                {9950, 40525, 0.12},
                {40525, 86375, 0.22},
                {86375, 164925, 0.24},
                {164925, 209425, 0.32},
                {209425, 523600, 0.35},
                {523600, Double.MAX_VALUE, 0.37}
        };

        for (double[] slab : taxSlabs) {
            if (taxableIncome > slab[0]) {
                double incomeInThisSlab = Math.min(taxableIncome, slab[1]) - slab[0];
                taxLiability += incomeInThisSlab * slab[2];
            } else {
                break;
            }
        }

        return taxLiability - taxCredits;
    }
}
