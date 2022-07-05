package p_1_inheritance;

public class InheritanceMain {

    public static void main(String[] args)
    {
        // All the classes inherited from object class
        A a = new A();
        // we cannot reach minus method like this
        // Base a = new A();
        // a.minus();

        B b = new B();
        C c = new C();

        a.write();
        b.write();
        c.write();

        call(a);
        call(b);
        call(c);
    }

    public static void call(Base base)
    {
        if(base instanceof A)
        {
            ((A) base).minus(10,4);
        }
        base.write();
    }
}
