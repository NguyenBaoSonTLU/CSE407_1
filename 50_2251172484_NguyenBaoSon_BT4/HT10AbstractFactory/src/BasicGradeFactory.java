// BasicGradeFactory.java
public class BasicGradeFactory implements GradeCalculatorFactory {
    @Override
    public GradeCalculator createStudentGradeCalculator(double[] initialScores) {
        return new BasicStudentGradeCalculator(initialScores);
    }

    @Override
    public GradeCalculator createClassGradeCalculator(double[] initialScores) {
        return new BasicClassGradeCalculator(initialScores);
    }
}
