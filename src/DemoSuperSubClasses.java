class ClassOne implements InerfaceOne{
    public void one(){
        System.out.print("One ClassOne");
    }

    @Override
    public void check() {
        System.out.println("Interface method in ClassOne");
    }
}

class ClassTwo extends ClassOne {
    /*public void one() {
        System.out.print("Two ClassTwo");
    }*/
    public void check() {
        System.out.println("ClassTwo.check");
    }
    public void check2() {
        System.out.println("ClassTwo.check2");
    }
}
interface InerfaceOne{
    int i=0;
    void check();
}

abstract class AbstractOne{
    abstract void absractOneCheck() ;
    void checkOne(){
        System.out.println("AbstractOne.checkOne");
    }
}
class CheckOne{}
/*interface ExtendsAbsractClass extends CheckOne{

}*/
class DemoAbractone extends  AbstractOne{

    @Override
    void absractOneCheck() {
        System.out.println("DemoAbractone.absractOneCheck");
    }
    void demoAbractOne() {
        System.out.println("DemoAbractone.demoAbractOne");
    }
}

public class DemoSuperSubClasses {
    public static void main(String[] args) {
        /*ClassOne classOne =new ClassTwo();
        classOne.check();
        classOne.one();*/
        InerfaceOne check=new ClassOne();
        check.check();
       /* InerfaceOne inerfaceOne = new ClassOne();
        inerfaceOne.check();
        AbstractOne abstractOne=new DemoAbractone();
        abstractOne.absractOneCheck();
        DemoAbractone demoAbractone=new DemoAbractone();
        demoAbractone.absractOneCheck();*/
    }

}
