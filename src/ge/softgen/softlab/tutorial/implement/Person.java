package ge.softgen.softlab.tutorial.implement;

import ge.softgen.softlab.tutorial.abstraction.Entity;

import java.time.LocalDate;

public class Person extends Entity {
    public static Integer count = 0;

    public Person(String firstName, String lastName, LocalDate birthDate, Integer salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
        setSalary(salary);
        ++count;
        id = count;
    }

    // advanced constructor
    public Person(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName, birthDate, 0);
        // ++count;
    }

    String firstName, lastName;
    Integer salary, id;

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new RuntimeException("Incorrect firstName!");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new RuntimeException("Incorrect lastName!");
        }
        this.lastName = lastName;
    }

    public void setSalary(Integer salary) {
        if (salary == null || salary < 0) {
            throw new RuntimeException("Incorrect salary");
        }
        this.salary = salary;
    }


    public static Integer getCount() {
        return count;
    }

    public Integer getId() {
        return id;
    }

    public void getFullInfo() {
        System.out.println(
                "Persons's Id: " + getId() +
                        "\nFirstname: " + firstName +
                        "\nLastname: " + lastName +
                        "\nDate of Birth: " + birthDate +
                        "\nSalary: " + salary + "\n");
    }
}