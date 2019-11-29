package observerexample;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserver<T> implements Observable {
    public List<Observer> observableList = new ArrayList<>();
    @Override
    public void addObserver(Observer o) {
        observableList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observableList.remove(o);
    }

    public void notify(T arg) {
        for (Observer<T> o :observableList) {
            o.update(arg);
        }
    }
}
