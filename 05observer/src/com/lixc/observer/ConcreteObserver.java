package com.lixc.observer;

/**
 * com.lixc.observer
 * 具体观察者
 * @author Lixc
 * @version 1.0
 * @since 2023-08-08 11:20
 */
public class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(name + " 收到通知，新状态为：" + subject.getState());
    }
}
