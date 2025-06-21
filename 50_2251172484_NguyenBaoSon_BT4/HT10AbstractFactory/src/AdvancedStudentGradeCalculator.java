// AdvancedStudentGradeCalculator.java
public class AdvancedStudentGradeCalculator extends StudentGradeCalculator {
    public AdvancedStudentGradeCalculator(double[] initialScores) {
        calculateAverage(initialScores);
    }

    @Override
    public void calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) sum += score;
        System.out.println("Advanced Student Average: " + (sum / scores.length));
    }

    @Override
    public String evaluateGrade(double averageScore) {
        if (averageScore >= 90) return "A";
        if (averageScore >= 80) return "B";
        if (averageScore >= 70) return "C";
        if (averageScore >= 60) return "D";
        return "F";
    }
}
