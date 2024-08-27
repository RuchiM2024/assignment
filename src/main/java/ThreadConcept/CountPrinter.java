package ThreadConcept;

import java.util.concurrent.ArrayBlockingQueue;

public class Print1toNUsingThread extends Thread{
    String name;
    ArrayBlockingQueue<Interger> inp=new ArrayBlockingQueue<Integer>(100);
    Print1toNUsingThread next;
    public void run()
    {
        for(;;)
        {
            try {
                Interger n=inp.take();
                lombok.val b = n == 11;
                if(b)
                {

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
