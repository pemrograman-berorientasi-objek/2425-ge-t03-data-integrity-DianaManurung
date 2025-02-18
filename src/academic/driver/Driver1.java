package academic.driver;

/**
 * @auther 12S23040 Diana Manurung
 * @auther 12S23047 Jennifer Sihotang
 */

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver1 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] segments = input.split("#");
            String command = segments[0];

            switch (command) {
                case "course-add":
                    if (courses.stream().noneMatch(course -> course.getId().equals(segments[1]))) {
                        courses.add(new Course(segments[1], segments[2], Integer.parseInt(segments[3]), segments[4]));
                    } else {
                        System.out.println("Duplicate course ID: " + segments[1]);
                    }
                    break;
                case "student-add":
                    if (students.stream().noneMatch(student -> student.getNim().equals(segments[1]))) {
                        students.add(new Student(segments[1], segments[2], Integer.parseInt(segments[3]), segments[4]));
                    } else {
                        System.out.println("Duplicate student NIM: " + segments[1]);
                    }
                    break;
                case "enrollment-add":
                    if (enrollments.stream().noneMatch(enrollment -> 
                        enrollment.getCourseId().equals(segments[1]) && 
                        enrollment.getStudentId().equals(segments[2]) && 
                        enrollment.getYear().equals(segments[3]) && 
                        enrollment.getSemester().equals(segments[4]))) {
                        enrollments.add(new Enrollment(segments[1], segments[2], segments[3], segments[4]));
                    } else {
                        System.out.println("Duplicate enrollment: " + segments[1] + " " + segments[2] + " " + segments[3] + " " + segments[4]);
                    }
                    break;
            }
        }

        for (Course course : courses) {
            System.out.println(course);
        }
        for (Student student : students) {
            System.out.println(student);
        }
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        scanner.close();
    }
}