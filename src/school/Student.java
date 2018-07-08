package school;

import java.util.regex.Pattern;

public class Student {
    private String name;
    private final int studentID;
    private int numberOfCredits;
    private double gpa;
    private static int autoStudentID = 1;
    private static String allowableNames = "[a-zA-z]([a-zA-z\\s\\-\\'])*";

    public Student(String name, int studentID,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name) {
        this(name, autoStudentID, 0, 0);
        autoStudentID++;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String aName) {
        if (!Pattern.matches(allowableNames, aName)) {
            throw new IllegalArgumentException("Name must start with a letter, cannot contain non-roman numerals");
        }

        name = aName;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public Integer getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(Integer aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public void addCredits(Integer newCredits) {
        setNumberOfCredits(numberOfCredits + newCredits);
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double aGpa) {
        gpa = aGpa;
    }

}
