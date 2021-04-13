package com.yqq.designPatterns.singleton;

/**
 * 单例（Singleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。例如，Windows 中只能打开一个任务管理器，
 * 这样可以避免因打开多个任务管理器窗口而造成内存资源的浪费，或出现各个窗口显示内容的不一致等错误。
 *
 * 在计算机系统中，还有 Windows 的回收站、操作系统中的文件系统、多线程中的线程池、显卡的驱动程序对象、打印机的后台处理服务、
 * 应用程序的日志对象、数据库的连接池、网站的计数器、Web 应用的配置对象、应用程序中的对话框、系统中的缓存等常常被设计成单例。
 *
 * 单例模式的优点：
 * 单例模式可以保证内存里只有一个实例，减少了内存的开销。
 * 可以避免对资源的多重占用。
 * 单例模式设置全局访问点，可以优化和共享资源的访问。
 *
 * 单例模式的结构
 * 单例类：包含一个实例且能自行创建这个实例的类。
 * 访问类：使用单例的类。
 *
 */
public class LazySingleton {

    /**
     * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。代码如下
     */
    private static volatile LazySingleton instance = null; //保证 instance 在所有线程中同步

    //使用 private 避免类在外部被实例化
    private LazySingleton() {
    }

    //加同步锁
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
