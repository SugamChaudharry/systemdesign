package in.SystemDesign.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String latestVideo;
    private final String channelName;

    Channel(String channelName){
        this.channelName = channelName;
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update("latest Video "+ latestVideo+ " has been uploaded");
        }
    }

    @Override
    public void addVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        System.out.println("Video : "+ videoTitle + " has been uploaded at yt channel : " + channelName);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        this.notifyObserver();
    }
}
