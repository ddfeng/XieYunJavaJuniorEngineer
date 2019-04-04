package 设计模式.单例模式;

/**
 * 最普通的饿汉
 */
public class Demo1 {
    private static Demo1 demo1 = new Demo1();

    private Demo1() {}

    public static Demo1 getDemo1() {
        return demo1;
    }
}
