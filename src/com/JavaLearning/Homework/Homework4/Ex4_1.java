package com.JavaLearning;

public class Ex4_1 {
    public static void main(String[] args) {
        Student student1 = new Student("20150001", "whx", "com1");
        System.out.println(student1.getInfo());
        Student student2 = new Student("20150002", "why", "com2");
        System.out.println(student2.getInfo());
        Student student3 = new Student("20150003", "whz", "com3");
        System.out.println(student3.getInfo());
    }
}
class Student {
    private String stuNum = null;
    private String stuName = null;
    private String stuProject = null;

    public Student(String stuNum, String stuName, String stuProject) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuProject = stuProject;
    }

    public String getInfo() {
        return "学号：" + stuNum + " 姓名：" + stuName + " 专业：" + stuProject;
    }
}
