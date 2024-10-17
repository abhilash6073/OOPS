package AbstractAndInterface;

public abstract class Parent2 {

    Parent2(){
        System.out.println("Main Parent2 ka constructor hun");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();

}
class child extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}


