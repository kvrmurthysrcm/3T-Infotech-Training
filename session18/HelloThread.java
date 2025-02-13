package session18;

/*
 * Subclass Thread. 
 * The Thread class itself implements Runnable, though its run method does nothing.
 *  An application can subclass Thread, providing its own implementation of run, as in the HelloThread example:
 * 
 */
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }

}
