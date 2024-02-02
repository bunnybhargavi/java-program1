import java.util.* ;
public class Employee{
    int empno;
    String empname;
    int Salary;
}
class Empdetail{
    public static void main(String args[])
    {
        int empno;
        String empname;
        int Salary;
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        System.out.println("Enter employe number:");
        empno=sc.nextInt();
        System.out.println("Enter employe name:");
        empname=sc.next();
        System.out.println("Enter employee salary");
        Salary=sc.nextInt();
        System.out.println("empNumber:"+ empno);
        System.out.println("empName:"+empname);
        System.out.println("empsal:"+Salary);
    }
}



