package 设计模式.单例模式;

/**
 * 懒汉式
 * 线程安全，同步代码块
 * 依然与Demo3一样存在多线程进入if(demo == null)从而产生多个实例
 */
public class Demo5 {
    private static Demo5 demo5;

    private Demo5() {};

    public static Demo5 getDemo5() {
        if(demo5 == null) {
            synchronized (Demo5.class) {
                demo5 = new Demo5();
            }
        }
        return demo5;
    }
}
