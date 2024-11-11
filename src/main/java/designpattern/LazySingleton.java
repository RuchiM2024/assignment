package designpattern;

public class LazySingleton {
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
