package in.SystemDesign.patterns.behavioral.observer;

public class User implements  Observer{
    private String name;

    User(String name){
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + " received: "+ msg);
        System.out.println("------------------------------");
    }
}
