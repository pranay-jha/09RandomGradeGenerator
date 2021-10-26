package com.company.views;

import com.company.models.StudentList;

public class CmdLineView {

    StudentList studentList;

    public CmdLineView(StudentList studentList) {
        this.studentList = studentList;
    }

    public void start() {
        String[] students = studentList.getStudentList();

        for(int i = 0; i < students.length; i++) {
            int randomGrade = (int) (Math.random() * 100 - 1);
            System.out.println(students[i] + " - " + randomGrade + "%");
        }
    }
}
