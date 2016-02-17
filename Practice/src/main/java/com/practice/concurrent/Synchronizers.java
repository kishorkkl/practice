package com.practice.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by sandeep on 16/02/2016.
 *
 * Understand synchronizers such as Latches,Barriers and Semaphores
 */
public class Synchronizers {

     public static void main(String[] args)
    {
        Synchronizers synch = new Synchronizers();
        synch.testLatches();
    }

    private void testLatches()
    {
        TestLatches latch = new TestLatches();

        try {
            long timeTaken=latch.timeTasks(10000, new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            System.out.println(timeTaken/1000000000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class TestLatches
{
    public long timeTasks(int nThreads,final Runnable task) throws InterruptedException
    {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for(int i=0;i<nThreads;i++)
        {
            Thread t = new Thread()
            {
                public void run()
                {
                    try
                    {
                       startGate.await();
                        try
                        {
                            task.run();
                        }finally
                        {
                            endGate.countDown();
                        }
                    }catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }

        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        return end-start;
    }
}
