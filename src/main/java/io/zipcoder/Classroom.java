package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Classroom(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }
}
