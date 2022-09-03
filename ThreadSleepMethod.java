import java.io.*;
import java.util.*;
public class ThreadSleepMethod {
    public static void main(String[] args){
        try{
            for(int j=0;j<5;j++){
                // System.out.println("ThreadSleepMethod: "+j);
                Thread.sleep(-100);
                System.out.println(j);

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
