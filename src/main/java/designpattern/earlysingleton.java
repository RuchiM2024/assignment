package designpattern;

public class earlysingleton {
    private static final earlysingleton obj=new earlysingleton();
    private earlysingleton()
    {}
    public static earlysingleton getEarlyObj()
    {
        return obj;
    }
}
