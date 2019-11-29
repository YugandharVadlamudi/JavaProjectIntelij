package observertwoexample;

import java.util.ArrayList;
import java.util.List;

public class MessagePublish implements Observable {
    public List<Observer> observableList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observableList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observableList.remove(observer);
    }

    @Override
    public void notifyObserver(MessageModel m) {
        for (Observer subscription:
             observableList) {
            subscription.update(m);
        }

    }
}
