package academic.model;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
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

    public String getid() {
        return this.id;
    }

    public String getcourse_name() {
        return this.course_name;
    }

    public int getsks() {
        return this.sks;
    }

    public String getgrade() {
        return this.grade;
    }

}