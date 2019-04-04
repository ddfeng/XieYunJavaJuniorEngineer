package 设计模式.工厂模式.抽象工厂模式;

abstract class Driver3Factory {
    public abstract BenzCar createBenzCar(String car) throws Exception;

    public abstract BmwCar createBmwCar(String car) throws Exception;

    public abstract AudiCar createAudiCar(String car) throws Exception;
}

class SportDriver extends Driver3Factory{
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzSportCar();
    }
    public BmwCar createBmwCar(String car) throws Exception {
        return new BmwSportCar();
    }
    public AudiCar createAudiCar(String car) throws Exception {
        return new AudiSportCar();
    }
}

class BusinessDriver extends Driver3Factory{
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzBusinessCar();
    }
    public BmwCar createBmwCar(String car) throws Exception {
        return new BmwBusinessCar();
    }
    public AudiCar createAudiCar(String car) throws Exception {
        return new AudiBusinessCar();
    }
}
