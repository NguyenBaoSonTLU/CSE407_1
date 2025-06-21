import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        GradeCalculationImpl basicImpl = new BasicGradeImpl();
        GradeCalculationImpl weightedImpl = new WeightedGradeImpl();


        StudentGradeCalculator studentCalculator = new StudentGradeCalculator(basicImpl);
        List<Double> grades = Arrays.asList(8.5, 7.0, 9.0, 6.5);
        double avg = studentCalculator.calculateAverage(grades);
        System.out.println(studentCalculator.generateReport(avg));


        CourseGradeCalculator courseCalculator = new CourseGradeCalculator(weightedImpl);
        Map<String, Double> courseGrades = new HashMap<>();
        courseGrades.put("Math", 8.5);
        courseGrades.put("Science", 7.0);
        courseGrades.put("History", 9.0);
        double courseAvg = courseCalculator.calculateAverage(courseGrades);
        courseCalculator.displayResult(courseAvg);


        studentCalculator.setImplementation(weightedImpl);
        List<Double> weightedGrades = Arrays.asList(8.5, 1.5, 7.0, 1.0, 9.0, 2.0);
        double weightedAvg = studentCalculator.calculateAverage(weightedGrades);
        System.out.println("Weighted Average: " + weightedAvg);
    }
}