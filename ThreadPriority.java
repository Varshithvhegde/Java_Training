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

    
    }
}
