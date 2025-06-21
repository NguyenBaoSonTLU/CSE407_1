public class GradeManager {
    public static void main(String[] args) {
        GradeCalculator calc = new WeightedGradeAdapter(new AdvancedAnalyticsService());

        double[] scores = {8.5, 9.0, 7.8, 9.2}; // Một số điểm ví dụ
        double average = calc.calculateAverage(scores);

        System.out.println("Weighted Average: " + average);
    }
}
