package com.lixc.singleton.staticinnerclass;

/**
 * com.lixc.singleton.staticinnerclass
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 23:14
 */
public class Singleton {
    private Singleton(){}
    private static class SingletonInstance{
        private static final Singleton instance=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}
