package p_6_singleton_pattern;

public class Singleton {

    //Singleton Pattern
    private static Singleton instanceObj = null;

    private static Object lock = new Object();

    public Singleton(){
        System.out.println("Singleton initialized");
    }

    public static Singleton instance(){
        if ( instanceObj == null ){
            synchronized (lock){
                instanceObj = new Singleton();
            }
        }
        return instanceObj;
    }
}
