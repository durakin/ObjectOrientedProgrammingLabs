package com.github.durakin.oop.sem1.lab5;

public class Teacher extends LibraryVisitor {
    public Teacher(String LASTNAME) {
        super(LASTNAME);
    }

    @Override
    public void printBooks() {
        System.out.println("Я взял так много для студентов");
    }
}
