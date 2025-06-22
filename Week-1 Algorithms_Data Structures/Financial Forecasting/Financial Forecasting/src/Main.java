import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinancialForecast forecast = new FinancialForecast();

        System.out.print("Enter initial investment: ");
        double initial = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.08 for 8%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        // Recursive forecast
        double recursiveResult = forecast.predictFutureValueRecursive(initial, rate, years);
        System.out.println("Future Value (Recursive): " + recursiveResult);

        // Optimized recursive (memoization)
        Double[] memo = new Double[years + 1];
        double memoResult = forecast.predictFutureValueMemo(initial, rate, years, memo);
        System.out.println("Future Value (Memoization): " + memoResult);

        // Iterative forecast
        double iterativeResult = forecast.predictFutureValueIterative(initial, rate, years);
        System.out.println("Future Value (Iterative): " + iterativeResult);
    }
}
