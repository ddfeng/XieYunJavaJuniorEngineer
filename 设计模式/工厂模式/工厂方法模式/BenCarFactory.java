package 设计模式.工厂模式.工厂方法模式;

public class BenCarFactory implements CarFactory{
    @Override
    public CarProduce craeateCar() {
        return new BenCar();
    }
}
