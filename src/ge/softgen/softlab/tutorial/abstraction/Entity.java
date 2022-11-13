package ge.softgen.softlab.tutorial.abstraction;

import java.time.LocalDate;
import java.time.Period;

public abstract class Entity {
    public LocalDate birthDate;

    public int getAge() {
        if (birthDate == null) {
            throw new RuntimeException("Incorrect Birthdate!");
        }
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public LocalDate getBirthday() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null) {
            throw new RuntimeException("Incorrect birthDate!");
        }
        this.birthDate = birthDate;
    }
}
