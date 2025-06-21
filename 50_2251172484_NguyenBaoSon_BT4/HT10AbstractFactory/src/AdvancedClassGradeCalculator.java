// AdvancedClassGradeCalculator.java
public class AdvancedClassGradeCalculator extends ClassGradeCalculator {
    public AdvancedClassGradeCalculator(double[] initialScores) {
        calculateAverage(initialScores);
    }

    @Override
    public void calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) sum += score;
        System.out.println("Advanced Class Average: " + (sum / scores.length));
    }

    @Override
    public String evaluateGrade(double averageScore) {
        return averageScore >= 75 ? "Good" : "Needs Improvement";
    }
}
