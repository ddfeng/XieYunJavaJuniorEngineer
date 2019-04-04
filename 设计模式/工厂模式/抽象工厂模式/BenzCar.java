package 设计模式.工厂模式.抽象工厂模式;

abstract class BenzCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

//具体产品（Bmw和Audi同理）
class BenzSportCar extends BenzCar{
    public void drive(){
        System.out.println(this.getName()+"----BenzSportCar-----------------------");
    }
}
class BenzBusinessCar extends BenzCar{
    public void drive(){
        System.out.println(this.getName()+"----BenzBusinessCar-----------------------");
    }
}
