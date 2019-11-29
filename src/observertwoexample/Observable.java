package observertwoexample;


public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(MessageModel m);
}
