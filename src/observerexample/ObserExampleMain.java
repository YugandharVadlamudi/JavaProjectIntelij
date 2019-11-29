package observerexample;

public class ObserExampleMain {
    public static void main(String[] args) {
        FooObservable fooObservableOne=new FooObservable();
        FooObservable fooObservableTwo = new FooObservable();
        FooObserver fooObserverOne=new FooObserver();
        FooObserver fooObserverTwo = new FooObserver();
        fooObservableOne.addObserver(fooObserverOne);
        fooObservableTwo.addObserver(fooObserverTwo);
        fooObservableOne.setState("Secound State");
        fooObservableOne.setState("Third State");
    }
}
