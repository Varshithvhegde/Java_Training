public class thread1 implements Runnable {
 
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Runnable t1 = new thread1();
        Thread t2 = new Thread(t1,"Hello My Name is Chinkki");
        t2.start();

        String str1 = t2.getName(); 
        System.out.println(str1);
    }
}
