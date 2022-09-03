class Single_Thread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Single_Thread t1 = new Single_Thread();
        t1.start();
    }
}