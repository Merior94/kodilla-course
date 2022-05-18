package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.toDoList.add("Zadanie 1");
        board.inProgressList.add("Zadanie 2");
        board.doneList.add("Zadanie 3");

        System.out.println("toDoList: " + board.toDoList);
        System.out.println("inProgressList: " + board.inProgressList);
        System.out.println("doneList: " + board.doneList);
    }
}
