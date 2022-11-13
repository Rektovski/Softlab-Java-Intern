package ge.softgen.softlab.tutorial.implement;

import java.time.LocalDate;

public class ForeignStudent extends Student {
    String country;

    public ForeignStudent(String firstName, String lastName, LocalDate birthDate, double gpa) {
        super(firstName, lastName, birthDate, gpa);
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }
}