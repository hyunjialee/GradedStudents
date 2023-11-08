package io.zipcoder;

public class Student {
    String firstName;
    String lastName;
    Double[] testScore;

    public Student (String firstName, String lastName, Double[] testScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScore = testScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getTestScore() {
        return testScore;
    }

    //Additionally, define a getter, getNumberOfExamsTaken(),
    // which returns the total number of exams taken by this student.
}
