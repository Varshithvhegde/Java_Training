import java.io.Serializable;

public class Student_Serialization  implements Serializable{
        int id;
        String name;
        public Student_Serialization(int id,String name){
            this.id=id;
            this.name=name;
    }
}
