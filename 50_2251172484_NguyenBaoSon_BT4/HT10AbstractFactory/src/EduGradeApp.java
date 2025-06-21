// EduGradeApp.java
public class EduGradeApp {
    private GradeCalculatorFactory factory;
    private GradeCalculator student;
    private GradeCalculator classCalc;

    public EduGradeApp(GradeCalculatorFactory factory) {
        this.factory = factory;
    }

    public void createGradeCalculator() {
        double[] studentScores = {85, 90, 78};
        double[] classScores = {70, 80, 60};

        student = factory.createStudentGradeCalculator(studentScores);
        classCalc = factory.createClassGradeCalculator(classScores);
    }

    public void calculateAndDisplayResults() {
        // Chỉ hiển thị điểm trung bình trong các hàm khởi tạo
        System.out.println("Student Grade: " + student.evaluateGrade(84));
        System.out.println("Class Grade: " + classCalc.evaluateGrade(70));
    }

    public static void main(String[] args) {
        GradeCalculatorFactory factory = new AdvancedGradeFactory();
        EduGradeApp app = new EduGradeApp(factory);
        app.createGradeCalculator();
        app.calculateAndDisplayResults();
    }
}
