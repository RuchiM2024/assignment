package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Semaphore ps=new Semaphore(5);
    private Semaphore cs=new Semaphore(0);
    private Queue qu=new ConcurrentLinkedQueue();
    private String name;
    public Consumer(Semaphore ps,Semaphore cs,Queue qu,String name)
    {
        this.ps=ps;
        this.cs=cs;
        this.qu=qu;
        this.name=name;
    }
    @Override
    public void run() {
        while (true) {
            try {
                cs.acquire();
            } catch (Exception e) {
            }
            qu.remove();
            System.out.println(this.name+" Added and size is " + qu.size());
            ps.release();
        }
    }
}
