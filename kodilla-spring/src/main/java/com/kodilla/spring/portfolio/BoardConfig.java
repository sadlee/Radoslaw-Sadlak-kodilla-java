package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    @Autowired
    @Qualifier("listOne")
    private TaskList listOne;

    @Autowired
    @Qualifier("listTwo")
    private TaskList listTwo;

    @Autowired
    @Qualifier("listThree")
    private TaskList listThree;

    @Bean
    public Board getBoard() {
        return new Board(listOne, listTwo, listThree);
    }

    @Bean(name = "listOne")
    @Scope("prototype")
    private TaskList getListOne() {
        return new TaskList();
    }

    @Bean(name = "listTwo")
    @Scope("prototype")
    private TaskList getListTwo() {
        return new TaskList();
    }

    @Bean(name = "listThree")
    @Scope("prototype")
    private TaskList getListThree() {
        return new TaskList();
    }
}