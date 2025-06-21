import java.util.Map;

public interface GradeBuilder {
    void reset();
    GradeBuilder buildStudentName(String name);
    GradeBuilder buildSubject(String subject);
    GradeBuilder buildScore(String subject, double score);
    double getStudentAverage();
    Map<String, Double> getSubjectAverages();
}
