class A
{
int data=40;
void msg()
{
System.out.println("Hello java");
}
}
public class Default
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}