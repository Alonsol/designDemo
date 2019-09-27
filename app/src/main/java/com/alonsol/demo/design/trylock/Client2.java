package com.alonsol.demo.design.trylock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Client2 {

    public static void main(String[] args) {
        Thread_condition thread_condition = new Thread_condition();
        thread_condition.setName("测试condition的线程");
        thread_condition.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        thread_condition.singal();
    }

    static class Thread_condition extends Thread {

        private ReentrantLock lock = new ReentrantLock();
        public Condition condition = lock.newCondition();

        @Override
        public void run() {
            await();
        }

        public void await() {
            try {
                System.out.println("lock");
                lock.lock();
                System.out.println(Thread.currentThread().getName() + ":我在等待通知的到来...");
                condition.await();//await和signal 对应
                System.out.println(Thread.currentThread().getName() + ":等到通知了，我继续执行>>>");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("unlock");
                lock.unlock();
            }
        }

        public void singal() {
            try {
                System.out.println("lock");
                lock.lock();
                System.out.println("我要通知在等待的过程，condition.signal()");
                condition.signal();//await和signal对应
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("unlock");
                lock.unlock();
            }
        }
    }
}
