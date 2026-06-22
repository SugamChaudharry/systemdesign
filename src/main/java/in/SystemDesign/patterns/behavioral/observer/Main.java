package in.SystemDesign.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel("xyz");
        Channel channel2 = new Channel("abc");

        User user1 = new User("sugam");
        User user2 = new User("bobby");
        User user3 = new User("ankit");
        User user4 = new User("papu");

        channel.addObserver(user1);
        channel.addObserver(user2);

        channel2.addObserver(user3);
        channel2.addObserver((user4));

        channel.addVideo("video 1");
//        channel.addVideo("video 2");
//        channel.addVideo("video 3");


//        channel2.addVideo("video 1");
//        channel2.addVideo("video 2");
        channel2.addVideo("video 3");
    }
}
