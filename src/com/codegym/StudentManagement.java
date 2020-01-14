package com.codegym;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagement {
    ArrayList<Student> listStudents=new ArrayList<Student>();

    public void inputList(){
        Student st1=new Student("HV01","Nguyen Nam");
        listStudents.add(st1);
        Student st2=new Student("HV02","Nguyen Bac DUong");
        listStudents.add(st2);
    }
    public void displayList(){
        Iterator<Student> iter=listStudents.iterator();
//        for(int i=0;i<listStudents.size();i++)
//            listStudents.get(i).display();
        while(iter.hasNext())
            iter.next().display();

    }

    public static void main(String[] args) {
        StudentManagement listTest=new StudentManagement();
        listTest.inputList();
        listTest.displayList();
    }
}
