// AdvancedGradeFactory.java
public class AdvancedGradeFactory implements GradeCalculatorFactory {
    @Override
    public GradeCalculator createStudentGradeCalculator(double[] initialScores) {
        return new AdvancedStudentGradeCalculator(initialScores);
    }

    @Override
    public GradeCalculator createClassGradeCalculator(double[] initialScores) {
        return new AdvancedClassGradeCalculator(initialScores);
    }
}
