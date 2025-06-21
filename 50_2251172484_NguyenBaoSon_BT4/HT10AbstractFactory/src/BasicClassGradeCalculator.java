// BasicClassGradeCalculator.java
public class BasicClassGradeCalculator extends ClassGradeCalculator {
    public BasicClassGradeCalculator(double[] initialScores) {
        calculateAverage(initialScores);
    }

    @Override
    public void calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) sum += score;
        System.out.println("Basic Class Average: " + (sum / scores.length));
    }

    @Override
    public String evaluateGrade(double averageScore) {
        return averageScore >= 65 ? "Satisfactory" : "Unsatisfactory";
    }
}
