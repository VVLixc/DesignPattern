package com.lixc.singleton.lanhanshi;

/**
 * com.lixc.singleton.lanhanshi
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 22:44
 */
public class Singleton02 {
    private Singleton02(){}
    private static Singleton02 instance;
    public static synchronized Singleton02 getInstance(){
        if (instance==null){
            instance=new Singleton02();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton02.getInstance()==Singleton02.getInstance());
        System.out.println(Singleton02.getInstance().hashCode());
        System.out.println(Singleton02.getInstance().hashCode());
    }
}
