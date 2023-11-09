package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    Student[] students;
    int maxNumberOfStudents;


    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }
    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents(){
        return this.students;
    }
    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (Student x : this.students){
            sum += x.getAverageExamScore();
        }
        return sum / this.students.length;
    }
    public void addStudent(Student student){

    }
    public removeStudent(String firstName, String lastName) {

    }
    public getStudentByScore(){

    }
    public getGradeBook(){

    }


}
