package observerexample;

public class FooObservable implements Observable<FooObservable> {
    private ConcreteObserver<FooObservable> fooObservableConcreteObserver = new ConcreteObserver<>();
    private String state = "Initial State";
    @Override
    public void addObserver(Observer<FooObservable> o) {
        fooObservableConcreteObserver.addObserver(o);
    }

    @Override
    public void removeObserver(Observer<FooObservable> o) {
        fooObservableConcreteObserver.removeObserver(o);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        fooObservableConcreteObserver.notify(this);
    }
}
