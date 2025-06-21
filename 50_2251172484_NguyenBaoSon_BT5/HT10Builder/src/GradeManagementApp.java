public class GradeManagementApp {
    public static void main(String[] args) {
        GradeDirector director = new GradeDirector();

        // Quản lý điểm sinh viên
        StudentGradeBuilder studentBuilder = new StudentGradeBuilder();
        director.setBuilder(studentBuilder);
        director.constructStudentGrade();
        System.out.println("Student Average: " + studentBuilder.getStudentAverage());
        System.out.println("Scores: " + studentBuilder.getSubjectAverages());

        // Quản lý điểm theo môn học
        SubjectGradeBuilder subjectBuilder = new SubjectGradeBuilder();
        director.setBuilder(subjectBuilder);
        director.constructSubjectGrades();
        System.out.println("Subject Averages: " + subjectBuilder.getSubjectAverages());
    }
}
