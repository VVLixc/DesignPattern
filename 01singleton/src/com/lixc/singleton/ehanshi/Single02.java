package com.lixc.singleton.ehanshi;

/**
 * com.lixc.singleton.ehanshi
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 19:29
 */
public class Single02 {
    private static final Single02 instance;
    static {
        instance=new Single02();
    }
    private Single02(){

    }
    public static Single02 getInstance(){
        return  instance;
    }

    public static void main(String[] args) {
        System.out.println(Single02.getInstance()==Single02.getInstance());
        System.out.println(Single02.getInstance().hashCode());
        System.out.println(Single02.getInstance().hashCode());
    }
}
