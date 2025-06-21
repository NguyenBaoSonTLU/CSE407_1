import java.util.HashMap;
import java.util.Map;

public class StudentGradeBuilder implements GradeBuilder {
    private String studentName;
    private Map<String, Double> scores;

    public StudentGradeBuilder() {
        reset();
    }

    public void reset() {
        studentName = "";
        scores = new HashMap<>();
    }

    public GradeBuilder buildStudentName(String name) {
        this.studentName = name;
        return this;
    }

    public GradeBuilder buildSubject(String subject) {
        scores.putIfAbsent(subject, 0.0);
        return this;
    }

    public GradeBuilder buildScore(String subject, double score) {
        scores.put(subject, score);
        return this;
    }

    public double getStudentAverage() {
        return scores.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public Map<String, Double> getSubjectAverages() {
        return scores;
    }
}
