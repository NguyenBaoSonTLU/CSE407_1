import java.util.List;

public class BasicGradeImpl implements GradeCalculationImpl {
    @Override
    public double calculate(List<Double> grades) {
        double sum = 0;
        for (Double grade : grades) {
            // Validate grade range [0, 10]
            if (grade < 0 || grade > 10) {
                throw new IllegalArgumentException("Grade must be between 0 and 10");
            }
            sum += grade;
        }
        return sum / grades.size();
    }
}