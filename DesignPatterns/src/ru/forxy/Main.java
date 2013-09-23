package ru.forxy;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:16
 * To change this template use File | Settings | File Templates.
 */

class A {
    private int id;
    public A(int id) {
        this.id = id;
    }
    protected void finalize() {
        System.out.println(id + " removed");
    }
    public A clone(){
        return new A(id);
    }
    public String toString() {
        return "A.Id: " + String.valueOf(id);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

class MyRun implements Runnable {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public void run() {

        for (int i = 0; i < 100; i++) {
            synchronized (lock1) {
                System.out.print("Lock2\n");
                synchronized (lock2) {
                }
            }
        }
    }
}

abstract class Base {
    protected int baseI;

    public Base(int i) {
        baseI = i;
    }
}

class Sub extends Base {
    protected int subI;

    public Sub(int i) {
        super(i + 1);
        subI = i;
    }

    public void m() {
        System.out.println(super.toString());
        System.out.println(super.baseI);
        System.out.println(subI);
    }
}

public class Main {



    public static void main(String[] args) throws InterruptedException {
        /*//Runtime.getRuntime().totalMemory();
        A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(3);
        WeakReference<A> ref1 = new WeakReference<A>(a1);
        SoftReference<A> ref2 = new SoftReference<A>(a2);
        ReferenceQueue<A> queue = new ReferenceQueue<A>();
        PhantomReference<A> ref3 = new PhantomReference<A>(a3, queue);
        a1 = null;
        a2 = null;
        a3 = null;
        System.gc();
        Thread.sleep(1000);
        *//*Thread thread1 = new Thread(new MyRun());
        Thread thread2 = new Thread(new MyRun());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();*//*
        A a = new A(1);
        a.clone();
        *//*System.out.println(a);
        System.out.println(a.clone());
        System.out.println(a == a.clone());*/

        /*HashMap<A, String> hashMap = new HashMap<A, String>();
        A a1 = new A(1);
        A a2 = new A(2);
        hashMap.put(a1, "1");
        hashMap.put(a2, "2");
        hashMap.put(a2, "3");
        System.out.println(hashMap.get(a1));
        System.out.println(hashMap.get(a2));*/

        //Sub s = new Sub(1);
        //s.m();
        Integer i = 0;
        System.out.println(Integer.parseInt("100.1", 8));
    }
}
