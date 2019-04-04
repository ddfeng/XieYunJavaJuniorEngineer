package 设计模式.单例模式;

/**
 * 饿汉式
 * 静态代码块
 */
public class Demo2 {
    private static Demo2 demo2;

    static {
        demo2 = new Demo2();
    }

    private Demo2() {}

    public static Demo2 getDemo2() {
        return demo2;
    }
}
