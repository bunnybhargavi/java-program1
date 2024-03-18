import java.util.Scanner;
public class Student1 {
  private int sno;
  private String sname;
  private int total;
  public void readValues(){
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter sno,sname,total values::");
    sno=sc.nextInt();
    sname=sc.next();
    total=sc.nextInt();
  }
  public String toString(){
    String Status="sno::"+this.sno +" "+"sname::"+this.sname+" "+"total marks::" +this.total;
    return Status;
  }
  public int totalMarks(){
    return this.total;
  }
}

