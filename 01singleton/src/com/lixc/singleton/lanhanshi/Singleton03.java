package com.lixc.singleton.lanhanshi;

/**
 * com.lixc.singleton.lanhanshi
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 22:44
 */
public class Singleton03 {
    private Singleton03(){}
    private static Singleton03 instance;
    public static Singleton03 getInstance(){
        if (instance==null){
            instance=new Singleton03();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton03.getInstance()== Singleton03.getInstance());
        System.out.println(Singleton03.getInstance().hashCode());
        System.out.println(Singleton03.getInstance().hashCode());
    }
}
