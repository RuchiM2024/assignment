package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Semaphore ps=new Semaphore(5);
    private Semaphore cs=new Semaphore(0);
    private Queue qu=new ConcurrentLinkedQueue();
    private String name;
    public Producer(Semaphore ps,Semaphore cs,Queue qu,String name)
    {
        this.ps=ps;
        this.cs=cs;
        this.qu=qu;
        this.name=name;
    }
    @Override
    public void run() {
        while(true) {
            try {
                ps.acquire();
            } catch (Exception e) {

            }
            qu.add(new Object());
            System.out.println(this.name+" Added and size is " + qu.size());
            cs.release();
        }
    }
}
