package session18;

import java.util.Random;
import java.util.concurrent.Callable;

/*
 * The need for Callable

There are two ways of creating threads – one by extending the Thread class and other by creating a thread with a Runnable. 
However, one feature lacking in  Runnable is that we cannot make a thread return result when it terminates, i.e. when run() completes. 
For supporting this feature, the Callable interface is present in Java.

Callable vs Runnable

For implementing Runnable, the run() method needs to be implemented which does not return anything, while for a Callable, the call() method 
needs to be implemented which returns a result on completion. 
Note that a thread can’t be created with a Callable, it can only be created with a Runnable.
Another difference is that the call() method can throw an exception whereas run() cannot.

 */
public class CallableExample implements Callable {

    public Object call() throws Exception 
    { 
        // Create random number generator 
        Random generator = new Random(); 
  
        Integer randomNumber = generator.nextInt(5); 
  
        // To simulate a heavy computation, 
        // we delay the thread for some random time 
        Thread.sleep(randomNumber * 1000); 
  
        return randomNumber; 
    } 
    
}
