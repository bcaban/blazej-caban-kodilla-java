package com.kodilla.spring.portfolio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList taskList1;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList taskList2;

    @Autowired
    @Qualifier("getDoneList")
    private TaskList taskList3;

    @Bean
    public Board getBoard() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "getDoneList")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
