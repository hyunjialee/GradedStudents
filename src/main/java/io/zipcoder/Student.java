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

    public String getExamScore() {
        //Returns back as a string representation of scores
        String x = "Exam Scores: ";
        for (int i = 0; i  < this.examScore.length ;i++) {
            x += "\n\tExam: " + (i+1) + " -> " + this.examScore[i].intValue();

        }
        return x;
    }

    public int getNumberOfExamsTaken() {
        return this.examScore.length;
    }
    // Additionally, define a getter, getNumberOfExamsTaken(),
    // which returns the total number of exams taken by this student.

    public void addExamScore(double examScore) {
        Double[] addScore; // This defining it, you don't have to initialize until
                                                // FOR LOOP and IF statement

        if (this.examScore != null && this.examScore.length >1) {
            addScore = new Double[this.examScore.length + 1];
            for (int i = 0; i < this.examScore.length; i++) {
            addScore[i] = this.examScore[i];
            }
            addScore[addScore.length - 1] = examScore;
        } else {
            addScore = new Double[]{examScore};
        }
        this.examScore = addScore;
            // Make a new array list and add one to it
            // then to the last element of the array, add in examScore :D
            // this.examScore.length - 1 = is the last element OF THE NEW ARRAY***
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScore[examNumber - 1] = newScore;

        // examNumber is the index in the list of this.examScore
        // if its equal to the examNumber then set it with a different value "newScore"

    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < this.examScore.length; i++) {
            sum += this.examScore[i];
        }
        return sum / this.examScore.length;
        // Taking the sum of all the scores and then dividing the length of it  :)
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Student Name: " + this.firstName + " " + this.lastName);
        sb.append("\nAverage Score: " + getAverageExamScore());
        sb.append("\n" + getExamScore());


        return sb.toString();
    }
}




