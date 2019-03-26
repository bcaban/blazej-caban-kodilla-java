package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    public final String username;
    public int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println(username + ": New tasks in queue " + studentTaskQueue.getName() + "\n" +
                " (total: " + studentTaskQueue.getStudentTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}