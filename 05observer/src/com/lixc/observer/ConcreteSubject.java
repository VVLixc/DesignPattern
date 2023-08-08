package com.lixc.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * com.lixc.observer
 * 具体被观察者
 * @author Lixc
 * @version 1.0
 * @since 2023-08-08 11:17
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
