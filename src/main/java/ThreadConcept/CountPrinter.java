package ThreadConcept;

import java.util.concurrent.ArrayBlockingQueue;

public class CountPrinter extends Thread{
    int counterNumber;

    public CountPrinter(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    @Override
    public void run() {
        System.out.println(this.counterNumber+"-Thread" +Thread.currentThread());
    }

}
