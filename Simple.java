import java.util.ArrayList;
class Simple
{
  public static void main (String[] args)
  {
    ArrayList a=new ArrayList();
    a.add(100);
    a.add("hello");
    a.add(98.5);
    System.out.println(a);
    System.out.println(a.toString());
    System.out.println(a.get(2));
  }
}