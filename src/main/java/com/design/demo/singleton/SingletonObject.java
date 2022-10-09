package com.design.demo.singleton;

/**
 * @author Bright
 * @description: TODO
 * @date 2022/9/26
 */
public class SingletonObject {

    //加个 volatile 是为了防止指令重排
    private static volatile SingletonObject INSTANCE;

    private SingletonObject() {
    }

    //双重锁检查：效率高
    public static SingletonObject getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonObject.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonObject();
                }
            }
        }
        return INSTANCE;
    }

    //使用同步方法：效率低
    public static synchronized SingletonObject getInstance2() {
        if (INSTANCE == null){
            INSTANCE=new SingletonObject();
        }
        return INSTANCE;
    }

    //todo 使用静态内部类实现登记式单例模式
    public static class SingletonHolder {
        public static final SingletonObject INSTANCE=new SingletonObject();
    }

}
