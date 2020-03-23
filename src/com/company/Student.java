package com.company;

public class Student<T extends Number> implements Learnable {
    private T learnByAge;
    private T learn;

    public Student(T learnByAge, T learn) {
        this.learnByAge = learnByAge();
        this.learn = learn();
    }

    public T learnByAge() {
        return learnByAge;
    }

    @Override
    public T learn() {
        return learn;
    }
}

