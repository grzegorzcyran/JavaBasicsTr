package edu.sda.java.advanced.enums;

import java.time.LocalDate;

/**
 * If we have class that does not allow modification
 * of it's fields - it's called IMMUTABLE
 *
 * That's good type of classes to work in multi-threaded environment
 */

public class Human {
    /**
     * final means that once we set a field
     * we won't change it
     *
     * final fields can be set in a constructor
     * or when creating a class
     */
    private final String name;
    private final String surname;
    private final Gender gender;

    private LocalDate dateOfBirth;

    private int age;

    public Human() {
        /**
         * Sample of no = composition, in this case we set object fields
         * when creating object
         */
        name = "Jan";
        surname = "Kowalski";
        gender = Gender.MALE;
    }

    /**
     * Below constructors that support composition, we get crucial data
     * from somewhere, and we do not create object from scratch
     */
    public Human(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Human(String name, String surname, String genderAbbrev) {
        this.name = name;
        this.surname = surname;
        this.gender = Gender.findByAbbrev(genderAbbrev); //call to static method, on enum and not on instance
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        calculateAge();
    }

    /**
     * We use this method in Human class only, we do not need to expose it then
     * It's enough to make it private
     */
    private void calculateAge(){
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }
}
