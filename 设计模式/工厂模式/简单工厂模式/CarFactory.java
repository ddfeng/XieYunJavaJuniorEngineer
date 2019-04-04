package 设计模式.工厂模式.简单工厂模式;

/**
 * 工厂类
 * 这个是用来生产汽车的
 * 根据外界条件来选择创建什么车
 */
public class CarFactory {
    public static Car getCar(String car) {
        Car car1 = null;
        if("BenCar".equalsIgnoreCase(car)) {
            car1 = new BenCar();
        }
        if("JeepCar".equalsIgnoreCase(car)) {
            car1 = new JeepCar();
        }
        if("SpotCar".equalsIgnoreCase(car)) {
            car1 = new SpotCar();
        }
        return car1;
    }
}
