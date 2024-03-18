
import java.util.*;
public class Studentapp1 {
  public static void main(String[] args) {
    Student1 s1=new Student1();
    s1.readValues();
    Student1 s2=new Student1();
    s2.readValues();
    Student1 s3=new Student1();
    s3.readValues();
    Student1 s4=new Student1();
    s4.readValues();
    List<Student1> l=new ArrayList<>();
    l.add(s1);
    l.add(s2);
    l.add(s3);
    l.add(s4);
    for (Student1 s:l){
      if(s.totalMarks()>300){
        System.out.println(s.toString( ));
      }
    }
  }
}
