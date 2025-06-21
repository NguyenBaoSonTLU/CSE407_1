// GradeCalculatorFactory.java
public interface GradeCalculatorFactory {
    GradeCalculator createStudentGradeCalculator(double[] initialScores);
    GradeCalculator createClassGradeCalculator(double[] initialScores);
}
