package academic.driver;

/**
 * @auther 12S23040 Diana Manurung
 * @auther 12S23047 Jennifer Sihotang
 */

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Driver2 {

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
                    courses.add(new Course(segments[1], segments[2], Integer.parseInt(segments[3]), segments[4]));
                    break;
                case "student-add":
                    students.add(new Student(segments[1], segments[2], Integer.parseInt(segments[3]), segments[4]));
                    break;
                case "enrollment-add":
                    String courseId = segments[1];
                    String studentId = segments[2];
                    boolean courseExists = courses.stream().anyMatch(course -> course.getId().equals(courseId));
                    boolean studentExists = students.stream().anyMatch(student -> student.getNim().equals(studentId));

                    if (!courseExists) {
                        System.out.println("invalid course|" + courseId);
                    } else if (!studentExists) {
                        System.out.println("invalid student|" + studentId);
                    } else {
                        enrollments.add(new Enrollment(courseId, studentId, segments[3], segments[4]));
                    }
                    break;
            }
        }

        courses.sort(Comparator.comparing(Course::getId));
        students.sort(Comparator.comparing(Student::getNim));
        enrollments.sort(Comparator.comparing(Enrollment::getCourseId)
                                   .thenComparing(Enrollment::getStudentId)
                                   .thenComparing(Enrollment::getYear)
                                   .thenComparing(Enrollment::getSemester));

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