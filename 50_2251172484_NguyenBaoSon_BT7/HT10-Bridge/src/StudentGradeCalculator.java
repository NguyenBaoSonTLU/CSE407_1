import java.util.List;

public class StudentGradeCalculator extends GradeCalculator {
    public StudentGradeCalculator(GradeCalculationImpl impl) {
        super(impl);
    }

    public String generateReport(double avg) {
        return "Student Report | Average: " + avg + " | Status: " + (avg >= 5 ? "PASS" : "FAIL");
    }
}