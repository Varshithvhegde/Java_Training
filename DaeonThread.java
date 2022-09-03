public class DaeonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is running...");
        }
        else{
            System.out.println("User thread is running...");
        }
    }
    public static void main(String[] args){
        DaeonThread t1=new DaeonThread();
        DaeonThread t2=new DaeonThread();
        DaeonThread t3=new DaeonThread();

        t1.setDaemon(true);//now t1 is daemon thread
        t1.start();//starting threads
        t2.start();
        t3.start();
    }
    
}
