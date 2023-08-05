package com.lixc.singleton.ehanshi;

/**
 * com.lixc.singleton.ehanshi
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 19:19
 */
public class Singleton01 {
    private static final Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        // true
        System.out.println(Singleton01.getInstance() == Singleton01.getInstance());
        System.out.println(Singleton01.getInstance().hashCode());
        System.out.println(Singleton01.getInstance().hashCode());
    }
}
