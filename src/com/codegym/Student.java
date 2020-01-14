package com.codegym;

public class Student {
    private String idStudent;
    private String nameStudent;

    public Student() {
    }

    public Student(String idStudent, String nameStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
    }
    public void display(){
        System.out.printf("%-10s%-30s\n",idStudent,nameStudent);
    }
}
