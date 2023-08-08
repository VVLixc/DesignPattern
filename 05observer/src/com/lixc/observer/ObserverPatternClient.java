package com.lixc.observer;

/**
 * com.lixc.observer
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-08 11:38
 */
public class ObserverPatternClient {
    public static void main(String[] args) {
        // 创建具体被观察者对象
        ConcreteSubject subject = new ConcreteSubject();

        // 创建具体观察者对象，并将其注册到被观察者中
        Observer observer1 = new ConcreteObserver("观察者1", subject);
        Observer observer2 = new ConcreteObserver("观察者2", subject);
        Observer observer3 = new ConcreteObserver("观察者3", subject);
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        // 改变被观察者的状态，会通知所有观察者
        subject.setState(10);

        // 移除一个观察者
        subject.detach(observer2);

        // 再次改变被观察者的状态，只通知剩下的观察者
        subject.setState(20);
    }
}
