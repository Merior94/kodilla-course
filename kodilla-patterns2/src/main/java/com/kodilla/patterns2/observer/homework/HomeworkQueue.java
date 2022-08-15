package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final List<String> homeworks;
    private final String name;

    public HomeworkQueue(String name) {
        this.observers = new ArrayList<>();
        this.homeworks = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String homework){
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }
}
