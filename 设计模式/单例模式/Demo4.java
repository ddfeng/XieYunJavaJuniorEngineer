package 设计模式.单例模式;

/**
 * 懒汉式
 * 解决线程安全问题
 * 但是存在效率太低的问题
 */
public class Demo4 {
    private static Demo4 demo4;

    private Demo4() {};

    public static synchronized Demo4 getDemo4() {
        if(demo4 == null) {
            demo4 = new Demo4();
        }
        return demo4;
    }
}
