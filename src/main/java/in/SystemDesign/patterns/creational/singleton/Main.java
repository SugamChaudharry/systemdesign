package in.SystemDesign.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton3 = Singleton2.getInstance();
        System.out.println(singleton2 == singleton3);
    }
}
