package in.SystemDesign.patterns.behavioral.observer;

public interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

    void addVideo(String videoTitle);

}
