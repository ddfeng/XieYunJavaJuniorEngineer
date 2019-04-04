package 设计模式.单例模式;

/**
 * 静态内部类
 * 优点是避免了线程不安全，延迟加载，效率高
 * 饿汉式的升级版本
 */
public class Demo7 {
    private Demo7() {};

    private static class DemoInstance {
        private static final Demo7 demo7 = new Demo7();
    }

    public static Demo7 getDemo7() {
        return DemoInstance.demo7;
    }
}
