package io.zipcoder;

public class Student {
    String firstName;
    String lastName;
    Double[] examScore;

    public Student(String firstName, String lastName, Double[] examScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScore = examScore;
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

    public Double[] getExamScore() {
        return examScore;
    }

    public int getNumberOfExamsTaken() {
        return examScore.length;
    }
    // Additionally, define a getter, getNumberOfExamsTaken(),
    // which returns the total number of exams taken by this student.

    public Double addExamScore(double examScore) {
        return null;
    }

    public Double getExamScore(int examNumber, double newScore) {
        return null;
    }

    public Double getAverageExamScore() {
        return null;
    }

    @Override
    public String toString() {
        return null; // the toString Method
    }
}




