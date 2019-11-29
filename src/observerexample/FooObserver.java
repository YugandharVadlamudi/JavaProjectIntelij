package observerexample;

public class FooObserver implements Observer<FooObservable> {
    private FooObservable fooObservable=new FooObservable();
    @Override
    public void update(FooObservable arg) {
        System.out.println("arg = " +fooObservable+"->"+ this);

        System.out.println("The state of my FooObservable "+arg+" is "+arg.getState());
    }
}
