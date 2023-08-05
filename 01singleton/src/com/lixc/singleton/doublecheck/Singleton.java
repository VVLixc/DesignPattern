package com.lixc.singleton.doublecheck;

import com.lixc.singleton.lanhanshi.Singleton01;

/**
 * com.lixc.singleton.doublecheck
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 23:04
 */
public class Singleton {
    private Singleton() {}

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton01.getInstance()==Singleton01.getInstance());
        System.out.println(Singleton01.getInstance().hashCode());
        System.out.println(Singleton01.getInstance().hashCode());
    }
}
