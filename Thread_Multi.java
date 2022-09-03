public class Thread_Multi extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Thread_Multi t1=new Thread_Multi();
        Thread_Multi t2=new Thread_Multi();
        t1.start();
        t2.start();
    }
    
}
