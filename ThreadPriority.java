public class ThreadPriority extends Thread {
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args){
        ThreadPriority t1=new ThreadPriority();
        ThreadPriority t2=new ThreadPriority();
        ThreadPriority t3=new ThreadPriority();

        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());
        System.out.println("t3 thread priority: "+t3.getPriority());

        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);

        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());
        System.out.println("t3 thread priority: "+t3.getPriority());
    
        System.out.println("Currently running thread: "+Thread.currentThread().getName());
        System.out.println("priority of currently running thread: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread: "+Thread.currentThread().getPriority());
    }
}

