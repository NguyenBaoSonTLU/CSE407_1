import java.util.List;
import java.util.Map;

public class CourseGradeCalculator extends GradeCalculator {
    public CourseGradeCalculator(GradeCalculationImpl impl) {
        super(impl);
    }

    public double calculateAverage(Map<String, Double> gradeMap) {
        List<Double> flattened = new ArrayList<>();
        for (Map.Entry<String, Double> entry : gradeMap.entrySet()) {
            flattened.add(entry.getValue());
            flattened.add(getSubjectWeight(entry.getKey()));
        }
        return implementation.calculate(flattened);
    }

    private double getSubjectWeight(String subject) {
        // In real implementation, this would fetch from database or config
        return 1.0; // Default weight
    }
}