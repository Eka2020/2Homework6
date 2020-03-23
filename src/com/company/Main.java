package com.company;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Student<Integer> student1 = new Student(18, 1);
        Student<Integer> student2 = new Student(20,3);
        Student<Integer> student3 = new Student(19,2);
        System.out.println(ANSI_YELLOW + "Возраст студента: " + student1.learnByAge() + " " + "Год обучения: " + student1.learn());
        System.out.println(ANSI_BLUE + "Возраст студента: " + student2.learnByAge() + " " + "Год обучения: " + student2.learn());
        System.out.println(ANSI_PURPLE + "Возраст студента: " + student3.learnByAge() + " " + "Год обучения: " + student3.learn());


    }
}
