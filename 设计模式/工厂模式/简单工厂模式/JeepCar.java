package 设计模式.工厂模式.简单工厂模式;

public class JeepCar implements Car{

    @Override
    public void task() {
        System.out.println("我是越野车，我当然要在轻轻大草原上疯狂驰骋");
    }
}
