package academic.model;

/**
 * @auther 12S23040 Diana Manurung
 * @auther 12S23047 Jennifer Sihotang
 */

public class Course {
    private String id;
    private String course_name;
    private int sks;
    private String grade;

    public Course(String _id, String course_name, int sks, String grade) {
        this.id = _id;
        this.course_name = course_name;
        this.sks = sks;
        this.grade = grade;
    }

    public String getId() {
        return this.id;
    }

    public String getCourse_name() {
        return this.course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + "|" + course_name + "|" + sks + "|" + grade;
    }
}