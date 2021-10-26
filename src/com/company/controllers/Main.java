package com.company.controllers;

import com.company.models.StudentList;
import com.company.views.CmdLineView;

public class Main {

    public static CmdLineView cmdLineView;

    public static void main(String[] args) {
        GetStudent getStudent = new GetStudent();
        String[] students = getStudent.getStudents();
        StudentList studentList = new StudentList(students);
        cmdLineView = new CmdLineView(studentList);
        cmdLineView.start();
    }
}
