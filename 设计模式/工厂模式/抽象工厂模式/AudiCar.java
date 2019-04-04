package 设计模式.工厂模式.抽象工厂模式;

abstract class AudiCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class AudiSportCar extends AudiCar{
    public void drive(){
        System.out.println(this.getName()+"----AudiSportCar-----------------------");
    }
}
class AudiBusinessCar extends AudiCar{
    public void drive(){
        System.out.println(this.getName()+"----AudiBusinessCar-----------------------");
    }
}

