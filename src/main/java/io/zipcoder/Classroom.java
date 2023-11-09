package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

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

        for (int i = 0 ; i <this.students.length; i++){
            if(this.students[i] == null){
                this.students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        // = SETTING
        // == COMPARING

        for (int i = 0; i < this.students.length; i++){
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
                this.students[i] = null;
                break;
            }
        }
        // for loop for i student equals to the firstName and the lastName
        //

    }
    public getStudentByScore(){
        //Returns an array representation of Student objects sorted into descending order by score
        // Use Arrays.sort for sort the Score and also the student names
        // Compared the exam scores and then compare the first name and last name
    }
    public getGradeBook(){
        //Hash map, key is Student Object and value is the grade given based on the percentile
    }
}
