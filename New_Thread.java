public class New_Thread extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread("Hello My Name is Chinkki");
        t1.start();

        String str1 = t1.getName();
        System.out.println(str1);
    }
    
}
