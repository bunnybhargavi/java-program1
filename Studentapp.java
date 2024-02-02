class Student
{
    int rollno;
    String name;
    int s1;
    int s2;
    int s3;
    int total;
    float per;
}
class  Studentapp{
    public static void main( String args[] )
{
    Student std1=new Student();
        std1.rollno=324;
        std1.name="bhargavi";
        std1.s1=90;
        std1.s2=98;
        std1.s3=99;
        std1.total=std1.s1+std1.s2+std1.s3;
        std1.per=((float)std1.total/300)*100;
        System.out.println("Rollno:"+std1.rollno);
        System.out.println("Name:"+std1.name);
        System.out.println("Total:"+std1.total);
        System.out.println("Percentage:"+std1.per);
    }
}