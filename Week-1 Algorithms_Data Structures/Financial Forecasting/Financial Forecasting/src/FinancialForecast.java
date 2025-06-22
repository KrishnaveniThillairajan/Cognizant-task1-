public class FinancialForecast {

    // Recursive method to calculate future value
    public double predictFutureValueRecursive(double initialValue, double growthRate, int years) {
        // Base case: year 0
        if (years == 0) {
            return initialValue;
        }
        // Recursive case
        return predictFutureValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized using memoization
    public double predictFutureValueMemo(double initialValue, double growthRate, int years, Double[] memo) {
        if (years == 0) {
            return initialValue;
        }
        if (memo[years] != null) {
            return memo[years];
        }
        memo[years] = predictFutureValueMemo(initialValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    // Iterative alternative (optional for performance comparison)
    public double predictFutureValueIterative(double initialValue, double growthRate, int years) {
        double value = initialValue;
        for (int i = 1; i <= years; i++) {
            value *= (1 + growthRate);
        }
        return value;
    }
}
