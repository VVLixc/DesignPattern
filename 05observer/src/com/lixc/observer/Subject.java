package com.lixc.observer;

/**
 * com.lixc.observer
 * 被观察者Subject接口
 * @author Lixc
 * @version 1.0
 * @since 2023-08-08 11:15
 */
public interface Subject {
    void attach(Observer observer); // 添加观察者
    void detach(Observer observer); // 移除观察者
    void notifyObservers(); // 通知观察者
}
