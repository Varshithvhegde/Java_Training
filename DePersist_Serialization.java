import java.io.*;
public class DePersist_Serialization {
    public static void main(String args[]){
        try (FileInputStream fin = new FileInputStream("f.txt")) {
            ObjectInputStream in=new ObjectInputStream(fin);
            Student_Serialization s=(Student_Serialization)in.readObject();
            System.out.println(s.id+" "+s.name);
            in.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
    
}
