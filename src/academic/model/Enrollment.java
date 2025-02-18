package academic.model;

/**
 * @auther 12S23040 Diana Manurung
 * @auther 12S23047 Jennifer Sihotang
 */

public class Enrollment {
    private String courseId;
    private String studentId;
    private String year;
    private String semester;
    private String grade;

    public Enrollment(String courseId, String studentId, String year, String semester) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.year = year;
        this.semester = semester;
        this.grade = "None";
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getYear() {
        return this.year;
    }

    public String getSemester() {
        return this.semester;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return courseId + "|" + studentId + "|" + year + "|" + semester + "|" + grade;
    }
}