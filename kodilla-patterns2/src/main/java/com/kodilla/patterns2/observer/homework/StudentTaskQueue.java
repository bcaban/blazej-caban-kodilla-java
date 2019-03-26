package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class StudentTaskQueue implements Observable {
    private final List<Observer> observers;
    private final Queue<StudentTask> studentTasks;
    private final String name;

    public StudentTaskQueue(String name) {
        observers = new ArrayList<>();
        studentTasks = new ArrayDeque<>();
        this.name = name;
    }

    public void offerTask(StudentTask studentTask) {
        studentTasks.offer(studentTask);
        notifyObservers();
    }

    public Queue<StudentTask> getStudentTasks() {
        return studentTasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}