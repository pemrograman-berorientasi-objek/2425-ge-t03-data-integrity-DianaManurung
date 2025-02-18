package academic.model;

/**
 * @auther 12S23040 Diana Manurung
 * @auther 12S23047 Jennifer Sihotang
 */

public class Student {
    private String nim;
    private String name;
    private int year;
    private String program;

    public Student(String nim, String name, int year, String program) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.program = program;
    }

    public String getNim() {
        return this.nim;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getProgram() {
        return this.program;
    }

    @Override
    public String toString() {
        return nim + "|" + name + "|" + year + "|" + program;
    }
}