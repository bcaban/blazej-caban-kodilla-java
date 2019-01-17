package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> addTasksToToDoList() {
        List<String> task1 = new ArrayList<>();
        task1.add("Go to the gym.");
        return task1;
    }

    public List<String> addTasksToInProgressList() {
        List<String> task2 = new ArrayList<>();
        task2.add("Programming in Java.");
        return task2;
    }


    public List<String> addTasksToDoneList() {
        List<String> task3 = new ArrayList<>();
        task3.add("Go jogging.");
        return task3;
    }
}
