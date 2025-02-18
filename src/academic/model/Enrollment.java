package academic.model;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */

public class Enrollment {
    private String id;
    private String nim;
    private String akt;
    private String semester;
    private String grade;

    public Enrollment(String id, String nim, String akt, String semester) {
        this.id = id;
        this.nim = nim;
        this.akt = akt;
        this.semester = semester;
        this.grade = "None"; 
    }

    public String getId() {
        return this.id;
    }

    public String getNim() {
        return this.nim;
    }

    public String getAkt() {
        return this.akt;
    }

    public String getSemester() {
        return this.semester;
    }

    public String getGrade() {
        return this.grade;
    }

}