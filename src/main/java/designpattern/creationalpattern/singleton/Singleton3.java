package designpattern.creationalpattern.singleton;

public enum Singleton3 {
    INSTANCE;

    public void print() {
        System.out.println("懒汉式（枚举）实现单例模式");
    }
}
