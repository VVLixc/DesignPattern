package com.lixc.singleton.lanhanshi;

/**
 * com.lixc.singleton.lanhanshi
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 19:41
 */
public class Singleton01 {
    private Singleton01(){}

    private static Singleton01 instance;

    public static Singleton01 getInstance(){
        if (instance==null){
            instance=new Singleton01();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton01.getInstance()==Singleton01.getInstance());
        System.out.println(Singleton01.getInstance().hashCode());
        System.out.println(Singleton01.getInstance().hashCode());
    }
}
