package CO5;

public class warningstest {

    public static void main(String[] args) {
        B b = new B();
        b.doSomething();
    }
}

class A{
    @Deprecated
    @SuppressWarnings("all")
    public void doSomething(){

    }
}

class B extends A{
    @SuppressWarnings("all")
    public void doSomething(){

    }
}