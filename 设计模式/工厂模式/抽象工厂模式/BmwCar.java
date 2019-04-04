package 设计模式.工厂模式.抽象工厂模式;

abstract class BmwCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class BmwSportCar extends BmwCar{
    public void drive(){
        System.out.println(this.getName()+"----BmwSportCar-----------------------");
    }
}
class BmwBusinessCar extends BmwCar{
    public void drive(){
        System.out.println(this.getName()+"----BmwBusinessCar-----------------------");
    }
}
