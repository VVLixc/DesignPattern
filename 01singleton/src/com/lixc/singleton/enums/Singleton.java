package com.lixc.singleton.enums;

/**
 * com.lixc.singleton.enums
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-02 23:30
 */
enum Singleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("Singleton instance is doing something."+Runtime.getRuntime());
    }
    public static void main(String[] args) {
        // 获取单例实例
        Singleton instance = Singleton.INSTANCE;
        // 调用单例方法
        instance.doSomething();
    }
}
