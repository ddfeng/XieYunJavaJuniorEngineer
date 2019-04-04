package 设计模式.单例模式;

/**
 * 双重检查
 * 优点是线程安全，延时加载，效率比较高
 */
public class Demo6 {
    private static Demo6 demo6;

    private Demo6() {};

    public static Demo6 getDemo6() {
        if(demo6 == null) {
            synchronized (Demo6.class) {
                if(demo6 == null) {
                    demo6 = new Demo6();
                }
            }
        }
        return demo6;
    }
}
