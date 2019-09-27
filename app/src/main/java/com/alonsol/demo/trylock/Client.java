package com.alonsol.demo.trylock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Thread thread1 = new Thread_tryLock(reentrantLock);
        thread1.setName("thread1");
        thread1.start();
        Thread thread2 = new Thread_tryLock(reentrantLock);
        thread2.setName("thread2");
        thread2.start();
    }

    static class Thread_tryLock extends Thread {
        ReentrantLock reentrantLock;

        public Thread_tryLock(ReentrantLock reentrantLock) {
            this.reentrantLock = reentrantLock;
        }

        @Override
        public void run() {
            try {
                System.out.println("try lock:" + Thread.currentThread().getName());
                boolean tryLock = reentrantLock.tryLock(3, TimeUnit.SECONDS);
                if (tryLock) {
                    System.out.println("try lock success:" + Thread.currentThread().getName());
                    System.out.println("睡眠一下：" + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("醒了：" + Thread.currentThread().getName());
                } else {
                    System.out.println("trylock 超时：" + Thread.currentThread().getName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("un lock ：" + Thread.currentThread().getName());
                reentrantLock.unlock();
            }
        }
    }
}
