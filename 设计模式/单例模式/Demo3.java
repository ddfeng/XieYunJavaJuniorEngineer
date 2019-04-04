package 设计模式.单例模式;

/**
 * 懒汉式
 */
public class Demo3 {
    private static Demo3 demo3;

    private Demo3() {};

    public static Demo3 getDemo3() {
        /**此处会产生线程安全问题*/
        if(demo3 == null) {
            demo3 = new Demo3();
        }
        return demo3;
    }
}
