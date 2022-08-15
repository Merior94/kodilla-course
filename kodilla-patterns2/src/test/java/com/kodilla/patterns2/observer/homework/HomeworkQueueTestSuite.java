package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    void TestHomeworkQueue(){
        //Given
        HomeworkMentor mentor1 = new HomeworkMentor("Mentor1");
        HomeworkMentor mentor2 = new HomeworkMentor("Mentor2");
        HomeworkMentor mentor3 = new HomeworkMentor("Mentor3");

        HomeworkQueue queue1 = new HomeworkQueue("Kursant1");
        HomeworkQueue queue2 = new HomeworkQueue("Kursant2");
        HomeworkQueue queue3 = new HomeworkQueue("Kursant3");

        queue1.registerObserver(mentor1);
        queue2.registerObserver(mentor1);
        queue3.registerObserver(mentor1);

        queue2.registerObserver(mentor2);
        queue3.registerObserver(mentor3);

        //When
        queue1.addHomework("Zadanie 1");
        queue2.addHomework("Zadanie 1");
        queue3.addHomework("Zadanie 1");

        //Then
        assertEquals(3,mentor1.getUpdateCount());
        assertEquals(1,mentor2.getUpdateCount());
        assertEquals(1,mentor3.getUpdateCount());
    }

}
