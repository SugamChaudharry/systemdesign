package in.SystemDesign.patterns.creational.singleton;

public class Singleton2 {
    private Singleton2(){}

    private static final class Holder {
        private static final Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Holder.instance;
    }
}
