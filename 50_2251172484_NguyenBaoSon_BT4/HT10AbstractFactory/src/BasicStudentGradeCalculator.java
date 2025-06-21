// BasicStudentGradeCalculator.java
public class BasicStudentGradeCalculator extends StudentGradeCalculator {
    public BasicStudentGradeCalculator(double[] initialScores) {
        calculateAverage(initialScores);
    }

    @Override
    public void calculateAverage(double[] scores) {
        // Logic đơn giản để tính điểm trung bình
        double sum = 0;
        for (double score : scores) sum += score;
        System.out.println("Basic Student Average: " + (sum / scores.length));
    }

    @Override
    public String evaluateGrade(double averageScore) {
        return averageScore >= 60 ? "Pass" : "Fail";
    }
}
