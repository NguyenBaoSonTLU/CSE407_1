// StudentGradeCalculator.java
public abstract class StudentGradeCalculator implements GradeCalculator {
    public abstract void calculateAverage(double[] scores);
    public abstract String evaluateGrade(double averageScore);
}
