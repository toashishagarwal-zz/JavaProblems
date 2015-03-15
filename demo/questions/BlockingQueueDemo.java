package demo.questions;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    
    protected BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
            Thread.sleep(1000);
            queue.put("4");
            Thread.sleep(1000);
            queue.put("5");
            Thread.sleep(1000);
            queue.put("6");
            Thread.sleep(1000);
            queue.put("7");
            Thread.sleep(1000);
            queue.put("8");
            Thread.sleep(1000);
            queue.put("9");
            Thread.sleep(1000);
            queue.put("10");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{
    protected BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    
    public void run() {
        try{
            Thread.sleep(5000);
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) throws Exception {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
        Thread.sleep(4000);
    }

}
