package DesignPattern;

public class EarlySingleton {
    private static final EarlySingleton obj=new EarlySingleton();
    private EarlySingleton()
    {}
    public static EarlySingleton getObj()
    {
        return obj;
    }
}

public class LazySingleton
{
    private static LazySingleton obj;
    private LazySingleton()
    {}
    public static LazySingleton getLazyObj()
    {
        if(obj==null)
        {
            synchronized (LazySingleton.class)
            {
                if(obj==null)
                {
                    obj=new LazySingleton();
                }
            }
        }
        return obj;
    }
}
public class BigPughSingleton
{
    private BigPughSingleton()
    {

    }
    public class InnerCLass
    {
        private static final InnerCLass obj=new InnerCLass();
    }
    public static
}