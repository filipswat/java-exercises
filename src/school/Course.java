package school;

import java.util.HashMap;

public class Course {
    private String courseName;
    private int courseCredits;
    private HashMap<Student, Double> classList;

    // currently Course is initialized only with an empty courselist, students to be added through addStudent method
    public Course(String courseName, int courseCredits) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.classList = new HashMap<>();
    }

    // getters for name, credits, classList

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public HashMap<Student, Double> getClassList() {
        return classList;
    }

    // may add a future option to set classList, but will be based on addStudent method

    // method below adds a student and grade to the list, then updates student's gpa
    public void addStudent(Student newStudent, double grade) {
        classList.put(newStudent, grade);

        // updates student gpa if a valid grade is input. if grade is below 0, it is implied that course is incomplete and gpa is not changed
        if (grade >= 0) {
            Integer oldCredits = newStudent.getNumberOfCredits();
            Integer newCredits = oldCredits + courseCredits;
            Double newGpa = ((newStudent.getGpa() * oldCredits) + (grade * courseCredits)) / newCredits;
            newStudent.setGpa(newGpa);
        }

        newStudent.addCredits(courseCredits);
    }

    public void updateStudentGrade(Student student, double newGrade) {
        if (classList.containsKey(student)) {
            Double newGpa;
            Double oldGrade = classList.get(student);
            if (oldGrade >= 0) {
                classList.put(student, newGrade);
                newGpa = (((student.getNumberOfCredits() - courseCredits) * student.getGpa()) - ((oldGrade - newGrade) * courseCredits)) / student.getNumberOfCredits();
            } else {
                newGpa = (((student.getNumberOfCredits() - courseCredits) * student.getGpa()) + (newGrade * courseCredits)) / student.getNumberOfCredits();
            }
            student.setGpa(newGpa);
        } else {
            System.out.println("No such student found");
        }
    }

    // can add functionality for removing students later, should be straightforward, gpa changes will be a little annoying

}
