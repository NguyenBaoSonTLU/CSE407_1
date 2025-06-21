import java.util.*;

public class SubjectGradeBuilder implements GradeBuilder {
    private String currentStudent;
    private Map<String, List<Double>> subjectScores;

    public SubjectGradeBuilder() {
        reset();
    }

    public void reset() {
        currentStudent = "";
        subjectScores = new HashMap<>();
    }

    public GradeBuilder buildStudentName(String name) {
        currentStudent = name;
        return this;
    }

    public GradeBuilder buildSubject(String subject) {
        subjectScores.putIfAbsent(subject, new ArrayList<>());
        return this;
    }

    public GradeBuilder buildScore(String subject, double score) {
        subjectScores.computeIfAbsent(subject, k -> new ArrayList<>()).add(score);
        return this;
    }

    public double getStudentAverage() {
        return 0.0; // Không áp dụng cho kiểu Subject
    }

    public Map<String, Double> getSubjectAverages() {
        Map<String, Double> averages = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : subjectScores.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            averages.put(entry.getKey(), avg);
        }
        return averages;
    }
}
