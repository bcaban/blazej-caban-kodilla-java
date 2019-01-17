package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void showLists() {
        System.out.println("Tasks in To Do List: " + toDoList.addTasksToToDoList());
        System.out.println("Tasks in Progress List :" + inProgressList.addTasksToInProgressList());
        System.out.println("Tasks in Done List: " + doneList.addTasksToDoneList());
    }


}
