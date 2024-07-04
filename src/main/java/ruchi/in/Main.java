package ruchi.in;

import ProducerConsumerSemaphore.Consumer;
import ProducerConsumerSemaphore.Producer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore ps=new Semaphore(5);
        Semaphore cs=new Semaphore(0);
        Queue q=new ConcurrentLinkedQueue();

        Producer p1=new Producer(ps,cs,q,"p1");
        Producer p2=new Producer(ps,cs,q,"p2");
        Producer p3=new Producer(ps,cs,q,"p3");
        Producer p4=new Producer(ps,cs,q,"p4");
        Producer p5=new Producer(ps,cs,q,"p5");

        Consumer c1=new Consumer(ps,cs,q,"c1");
        Consumer c2=new Consumer(ps,cs,q,"c2");
        Consumer c3=new Consumer(ps,cs,q,"c3");
        Consumer c4=new Consumer(ps,cs,q,"c4");
        Consumer c5=new Consumer(ps,cs,q,"c5");

        Thread t1=new Thread(p1);
        t1.start();
        Thread t2=new Thread(p2);
        t2.start();
        Thread t3=new Thread(p3);
        t3.start();
        Thread t4=new Thread(p4);
        t4.start();
        Thread t5=new Thread(p5);
        t5.start();
        Thread t6=new Thread(c1);
        t6.start();
        Thread t7=new Thread(c2);
        t7.start();
        Thread t8=new Thread(c3);
        t8.start();
        Thread t9=new Thread(c4);
        t9.start();
        Thread t10=new Thread(c5);
        t10.start();
        /*System.out.println("Hello world!");
        C objC=new C();
        objC.func1();
        objC.func2();
        objC.func();*/
    }
}