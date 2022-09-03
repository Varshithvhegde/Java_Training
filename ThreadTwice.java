public class ThreadTwice extends Thread {
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args){
        ThreadTwice t1=new ThreadTwice();
        t1.start();
        t1.start();
    }
    
}
/* output
 * Exception in thread "main" Thread is running...
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:789)
        at ThreadTwice.main(ThreadTwice.java:8)
 * Exception in thread "main" java.lang.IllegalThreadStateException
 * 
 */