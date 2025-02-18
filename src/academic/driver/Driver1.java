package academic.driver;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */

 import academic.model.Course;
 import academic.model.Enrollment;
 import academic.model.Student;
 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Collections;
 import java.util.Comparator;
 
 public class Driver1 {

    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();

        while(true){
            String str = sc.nextLine();
            if(str.equals("---")){
                break;
            }

            String[] tokens = str.split("#");
            if(tokens[0].equals("student-add")){
                String id_student = tokens[1];
                String name_student = tokens[2];
                int akt = Integer.parseInt(tokens[3]);
                String prodi = tokens[4];
                Student student = new Student(id_student, name_student, akt, prodi);
                students.add(student);
            } else if(tokens[0].equals("course-add")){
                String id_course = tokens[1];
                String name_course = tokens[2];
                int sks = Integer.parseInt(tokens[3]);
                String grade = tokens[4];
                Course course = new Course(id_course, name_course, sks, grade);
                courses.add(course);

            } else if(tokens[0].equals("enrollment-add")){
                String id_course = tokens[1];
                String id_student = tokens[2];
                String year = tokens[3];
                String semester = tokens[4];
                Enrollment enrollment = new Enrollment(id_course, id_student, year, semester);
                enrollments.add(enrollment);
            }
        }

        Collections.sort(courses, new Comparator<Course>(){
            public int compare(Course c1, Course c2){
                return c1.getid().compareTo(c2.getid()); 
            }
        });

        for(Course course : courses){
            System.out.println(course.getid() + "|" + course.getcourse_name() + "|" + course.getsks() + "|" + course.getgrade());
        }

        for(Student student : students){
            System.out.println(student.getNim() + "|" + student.getName() + "|" + student.getakt() + "|" + student.getprodi());
        }

        for(Enrollment enrollment : enrollments){
            System.out.println(enrollment.getId() + "|" + enrollment.getNim() + "|" + enrollment.getAkt() + "|" + enrollment.getSemester() + "|None");
        }

        sc.close();
    }
}