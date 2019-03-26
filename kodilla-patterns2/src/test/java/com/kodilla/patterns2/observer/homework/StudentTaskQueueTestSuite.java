package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTask task1 = new StudentTask("Task 1");
        StudentTask task2 = new StudentTask("Task 2");
        StudentTask task3 = new StudentTask("Task 3");
        StudentTask task4 = new StudentTask("Task 4");
        StudentTask task5 = new StudentTask("Task 5");
        StudentTask task6 = new StudentTask("Task 6");

        StudentTaskQueue ivoneTasks = new IvoneTaskQueue();
        StudentTaskQueue jessieTasks = new JessieTaskQueue();
        StudentTaskQueue johnTasks = new JohnTaskQueue();

        Mentor mentorAdam = new Mentor("Adam");
        Mentor mentorPatrick = new Mentor("Patrick");

        ivoneTasks.registerObserver(mentorAdam);
        jessieTasks.registerObserver(mentorAdam);
        johnTasks.registerObserver(mentorPatrick);

        //When
        ivoneTasks.offerTask(task1);
        jessieTasks.offerTask(task2);
        jessieTasks.offerTask(task3);
        jessieTasks.offerTask(task4);
        johnTasks.offerTask(task5);
        johnTasks.offerTask(task6);

        //Then
        assertEquals(4, mentorAdam.getUpdateCount());
        assertEquals(2, mentorPatrick.getUpdateCount());

    }
}