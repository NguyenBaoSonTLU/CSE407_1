// ClassGradeCalculator.java
public abstract class ClassGradeCalculator implements GradeCalculator {
    public abstract void calculateAverage(double[] scores);
    public abstract String evaluateGrade(double averageScore);
}
