public class GradeDirector {
    private GradeBuilder builder;

    public void setBuilder(GradeBuilder builder) {
        this.builder = builder;
    }

    public void constructStudentGrade() {
        builder.reset()
                .buildStudentName("John Doe")        // Phải không lỗi
                .buildSubject("Math").buildScore("Math", 8.5)
                .buildSubject("Physics").buildScore("Physics", 7.2);
    }

    public void constructSubjectGrades() {
        builder.reset()
                .buildSubject("Math").buildScore("Math", 8.0)
                .buildScore("Math", 7.5)
                .buildScore("Math", 9.0)
                .buildSubject("Physics").buildScore("Physics", 6.0)
                .buildScore("Physics", 7.5);
    }
}
