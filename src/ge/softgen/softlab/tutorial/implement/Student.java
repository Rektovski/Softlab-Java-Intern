package ge.softgen.softlab.tutorial.implement;

import java.time.LocalDate;

public class Student extends Person {
    private double gpa;

    public Student(String firstName, String lastName, LocalDate birthDate, double gpa) {
        super(firstName, lastName, birthDate);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}