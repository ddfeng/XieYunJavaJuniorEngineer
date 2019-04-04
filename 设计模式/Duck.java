package 设计模式;

public abstract class Duck {
    DuckInterface duckInterface;
    public void duckFly() {
        duckInterface.fiy();
    }
    public void sound() {
        System.out.println("苍茫的天涯我滴爱");
    }
}
