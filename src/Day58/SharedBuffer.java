package Day58;
import java.util.LinkedList; // to use LinkedList<>(), implements the queue interface
import java.util.Queue; // to use poll(), size(),
import java.lang.Math; // to run math random

// 1. Set up a new Java project in your preferred IDE or text editor.
public class SharedBuffer { // 2. Define a SharedBuffer class to handle the shared buffer between producer and consumer threads. Implement the following functionalities:
    private Queue<String> buffer = new LinkedList<>(); // 2a. Store and manage the buffer
    private int maxSize;                               // 2b. Limit the maximum buffer size.

    public SharedBuffer(int maxSize) { // 2c. Provide synchronized methods for adding elements to and removing elements from the buffer.
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }
    // / wait, notify, and notifyAll methods
    // create 2 classes
    public synchronized void produce(String item) { // 2d. Use wait() and notifyAll() methods to coordinate access to the buffer.
        while (buffer.size() == maxSize) {          // Buffer is full, wait for the consumer to remove elements, since I capped it at 5, fifo takes place until consumer takes action
            try {
                wait(); // 2b. Wait if buffer is full // 2d. Use wait() and notifyAll() methods to coordinate access to the buffer.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(item); // 2c. Add item to the buffer
        System.out.println("Is produce working: " + item); // test it
        notifyAll(); // 2d. Notify consumer that a new item is available
    }

    public synchronized String consume() { // 2d. Use wait() and notifyAll() methods to coordinate access to the buffer.
        while (buffer.isEmpty()) {      // Buffer is full, wait for the consumer to remove elements
            try {
                wait(); // // 2b. Wait if buffer is full // 2d. Use wait() and notifyAll() methods to coordinate access to the buffer.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String item = buffer.poll();; // (2c) Remove and return number from the buffer //intellij will convert it from int number = buffer.poll(); // poll()Removes the head of the queue and returns it. If the queue is empty, it returns null.
        System.out.println("Is consumer consuming: " + item); // test it
        notifyAll(); // (2d) Notify producer that a number has been consumed
        return item;
    }
}

// Runnable object represents a task that is executed by a Thread and is created by implementing the Runnable interface
// 3. Implement a Consumer class that represents the consumer thread. This class should:
class Consumer implements Runnable {
    private SharedBuffer sharedBuffer; // 3. Reference class SharedBuffer object
    private int sum; // 3c. Variable to store the sum of retrieved numbers

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer; // 3a Accept a reference to the SharedBuffer object
        this.sum = 0;
    }

    // The run() method contains the code that will be executed when the Thread is started. It is defined
    // within a Runnable object as seen in the previous example. And is invoked when the Thread is passed to is ‘started’
    public void run() {
        for (int i = 0; i < 10; i++) { // my buffer size is 10
            String item = sharedBuffer.consume(); // 3b. Retrieve number from the shared buffer
            int number = Integer.parseInt(item); // 3c. Calculate the sum of retrieved numbers
            sum = sum + number;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer total sum: " + sum);
    }
}

class Main { // In the main method or a separate Main class:
    public static void main(String[] args) {
            int maxSize = 5; // 4a. Create an instance of the SharedBuffer class with a specified maximum size. // put this first otherwise sharedbuffer below wont take in argument
            SharedBuffer sharedBuffer = new SharedBuffer(maxSize); // 4a. Create an instance of the SharedBuffer class with a specified maximum size.


            Producer producer = new Producer(sharedBuffer); // 4b. Instantiate the Producer class, passing the SharedBuffer instance
            Consumer consumer = new Consumer(sharedBuffer); // 4b. Instantiate the Consumer class, passing the SharedBuffer instance

            Thread producerThread = new Thread(producer); // 4c. Create two Thread objects, one for the producer and one for the consumer, using the instances created in the previous step.
            Thread consumerThread = new Thread(consumer); // 4c. Create two Thread objects, one for the producer and one for the consumer, using the instances created in the previous step.

            producerThread.start(); // 4d. Start the consumer thread
            consumerThread.start(); // 4d. Start the consumer thread
    }
}

class Producer implements Runnable { // Why wasn't this said before step 4????
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer; // 6a. Accept a reference to the SharedBuffer object
    }

    // The run() method contains the code that will be executed when the Thread is started. It is defined
    // within a Runnable object as seen in the previous example. And is invoked when the Thread is passed to is ‘started’
    public void run() {
        for (int i = 0; i < 10; i++) { // my buffer size is 10
            int number = generateRandomNumber(); // 6b. Generate random number
            sharedBuffer.produce(String.valueOf(number));// 6c. Add the random number to the shared buffer
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int generateRandomNumber() { // 6b. Generate random number
        return (int) (Math.random() * 100); // use math random up to 100, make int since it can be double
    }

}

// To recap, think of a printer machine. Producer requests to print something in the printer which is our buffer and the consumer is when the printer prints the result. I can cap the print to take 5 requests to print 5 files or pdfs and until the papers print, it waits till 1 is printed to become 4, then another one can be queued up.
// NotifyAll() is used to notify all threads. If we had hundreds of thread, makes no sense to notify threads that have no similarities or involvement. But for assignment, theres only 2 so notifyall suffices.


//        Implement a simple producer-consumer problem
//
//        Create a Java program that simulates a producer-consumer scenario. The producer generates random numbers and puts them into a shared buffer, while the consumer takes the numbers from the buffer and calculates their sum. Use threads, synchronization, and the wait() and notifyAll() methods to ensure proper coordination between the producer and consumer.
//
//
//
//       1 Set up a new Java project in your preferred IDE or text editor.
//
//       2 Define a SharedBuffer class to handle the shared buffer between producer and consumer threads. Implement the following functionalities:
//
//        a. Store and manage the buffer.
//
//        b. Limit the maximum buffer size.
//
//        c. Provide synchronized methods for adding elements to and removing elements from the buffer.
//
//        d. Use wait() and notifyAll() methods to coordinate access to the buffer.
//
//      3  Implement a Consumer class that represents the consumer thread. This class should:
//
//        a. Accept a reference to the SharedBuffer object.
//
//        b. Retrieve numbers from the shared buffer using the appropriate synchronized method.
//
//        c. Calculate the sum of the retrieved numbers.
//
//      4  In the main method or a separate Main class:
//
//        a. Create an instance of the SharedBuffer class with a specified maximum size.
//
//        b. Instantiate the Producer and Consumer classes, passing the SharedBuffer instance to both.
//
//        c. Create two Thread objects, one for the producer and one for the consumer, using the instances created in the previous step.
//
//        d. Start both threads.
//
//      5  Test the program to ensure that the producer generates random numbers, the consumer calculates their sum, and proper coordination is maintained between the two threads using synchronization, wait(), and notifyAll() methods.
//
//      6  Implement a Producer class that represents the producer thread. This class should:
//
//        a. Accept a reference to the SharedBuffer object.
//
//        b. Generate random numbers.
//
//        c. Add the random numbers to the shared buffer using the appropriate synchronized method.
