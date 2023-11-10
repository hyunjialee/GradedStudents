package io.zipcoder;

import org.junit.Assert;

import java.util.*;

public class Classroom {
    Student[] students;
    int maxNumberOfStudents;


    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return this.students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student x : this.students) {
            sum += x.getAverageExamScore();
        }
        return sum / this.students.length;
    }

    public void addStudent(Student student) {
        // Need to add one to the array------------------------------------------
//        Student[] addStudent;
//        if (this.students != null && this.students.length > 1) {
//            addStudent = new Student[this.students.length + 1];
//            for (int i = 0; i < this.students.length; i++) {
//                addStudent[i] = this.students[i];
//            }
//            addStudent[addStudent.length - 1] = student;
//        } else {
//            addStudent = new Student[]{student};
//        }
//        this.students = addStudent; ------------------------------------------

        // THE ABOVE DOES NOT WORK, When an array is created it takes null values into array if they are not used
        // Example an array of 10 students are made and only 5 students are take into the first 5 slots
        // the other five have null
        //  This is only pertaining to OBJECT ARRAYS.

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        // = SETTING
        // == COMPARING

        for (int i = 0; i < this.students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                this.students[i] = null;
                break;
            }
        }
        // for loop for i student equals to the firstName and the lastName
        //

    }

    public Student[] getStudentByScore() {
        //Returns an array representation of Student objects sorted into descending order by score
        // Use Arrays.sort for sort the Score and also the student names
        // Compared the exam scores and then compare the first name and last name

        Student[] studentByScore = new Student[students.length];

        for (int i = 0; i < students.length; i++) {
            studentByScore[i] = students[i];
            // Put students into a new array to place them as scores into
        } Arrays.sort(studentByScore, (student1, student2) -> {
            // Using lambda to compare two objects to each other student1 and student2
            // Need to sort array and compared each student into the array
            // parameter -> expression || here are using (parameter 1, parameter 2) -> expression

            if (student1.getAverageExamScore().equals(student2.getAverageExamScore())) {
                // Comparing by test scores

                //*** Need to add an if statement when there is a student that is not being compared to
                // return back the student that is not being compared

                if (student1.getFirstName().equals(student2.getFirstName())) {
                    return student1.getLastName().compareTo(student2.getLastName());
                    // Comparing by last names if first name is equal to each other

                } else {
                    // Returning the first name of the student if names are different
                    return student1.getFirstName().compareTo(student2.getFirstName());
                }
            } else {
                return student2.getAverageExamScore().compareTo(student1.getAverageExamScore());
                // Returning the array into descending order based on the exam score of the student
            }
        });
            return studentByScore; // The exam scores sorted in descending order
    }

    public Map<Student, Character> getGradeBook() {

        Map<Student, Character> studentGrade = new HashMap<>();
        // Hash map, key is student and value is the letter grade given based on the percentile of exam score average

        Student[] orderedStudents = getStudentByScore();

        Double highestScore = orderedStudents[0].getAverageExamScore();

        for(Student student: orderedStudents){
            char letterGrade;
            // Loop through all the students that are sorted
            if (student.getAverageExamScore() >= highestScore * .89){
                letterGrade = 'A'; // 90th percentile
            } else if (student.getAverageExamScore() >= highestScore * .71) {
                letterGrade = 'B'; // 71 - 89th percentile
            } else if (student.getAverageExamScore() >= highestScore * .51) {
                letterGrade = 'C'; // 51 - 70th percentile
            } else if (student.getAverageExamScore() >= highestScore * .11) {
                letterGrade = 'D'; // 11 - 50th percentile
            } else {
                letterGrade = 'F'; // 11th percentile and lower
            }
            studentGrade.put(student, letterGrade);
            //Hash Map used with student and their letter grade
        }
        return studentGrade;
    }
}