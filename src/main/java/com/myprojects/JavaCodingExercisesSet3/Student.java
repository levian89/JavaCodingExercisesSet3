package com.myprojects.JavaCodingExercisesSet3;

import java.util.Scanner;

public class Student {
    private int marks;

    public Student(int marks) {
        this.marks=marks;
    }

    public char assignGrade() {
        if(marks<0 || marks>100) {
            return 'X';
        }
        if(marks>=90) {
            return 'A';
        }
        if(marks>=80) {
            return 'B';
        }
        if(marks>=70) {
            return 'C';
        }
        if(marks>=60) {
            return 'D';
        }
        if(marks>=50) {
            return 'E';
        }
        return 'F';
    }
    public static void main(String[] args) {
        Student student = new Student(85);
        System.out.println(student.assignGrade());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark, please: ");
        int mark = scanner.nextInt();
        Student student1 = new Student(mark);
        System.out.println("Assigned grade: " + student1.assignGrade());
    }
}

