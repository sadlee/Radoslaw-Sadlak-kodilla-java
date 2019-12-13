package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    @Autowired
    @Qualifier("listOne")
    public TaskList listOne;

    @Autowired
    @Qualifier("listTwo")
    public TaskList listTwo;

    @Autowired
    @Qualifier("listThree")
    public TaskList listThree;

    @Bean
    public Board getBoard() {
        return new Board(listOne, listTwo, listThree);
    }

    @Bean(name = "listOne")
    @Scope("prototype")
    public TaskList getListOne() {
        return new TaskList();
    }

    @Bean(name = "listTwo")
    @Scope("prototype")
    public TaskList getListTwo() {
        return new TaskList();
    }

    @Bean(name = "listThree")
    @Scope("prototype")
    public TaskList getListThree() {
        return new TaskList();
    }
}