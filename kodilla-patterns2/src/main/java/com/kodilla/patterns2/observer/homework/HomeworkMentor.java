package com.kodilla.patterns2.observer.homework;

public class HomeworkMentor implements HomeworkObserver {
    private String name;
    private int updateCount;

    public HomeworkMentor(String name) {
        this.name = name;
        this.updateCount = 0;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": New homeworks in queue " + homeworkQueue.getName() + "\n" +
                " (total: " + homeworkQueue.getHomeworks().size() + " homeworks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
