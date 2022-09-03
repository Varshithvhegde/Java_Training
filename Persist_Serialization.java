import java.io.*;

public class Persist_Serialization {
    public static void main(String[] args) throws Exception{
        Student_Serialization s1=new Student_Serialization(211,"ravi");
        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        System.out.println("success");
        FileInputStream fin=new FileInputStream("f.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        Student_Serialization s=(Student_Serialization)in.readObject();
        System.out.println(s.id+" "+s.name);
        in.close();
    }
}
