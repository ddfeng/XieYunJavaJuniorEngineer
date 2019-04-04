package 设计模式;

import org.junit.Test;

public class DuckTest extends Duck {
    public DuckTest()
    {
        duckInterface = new DuckFly1();
    }
    @Test
    public void test() {
        //duckInterface.fiy();
        Duck duck = new DuckTest();
        duck.duckFly();
    }
}

