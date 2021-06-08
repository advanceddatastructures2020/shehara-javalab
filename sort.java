import java.util.Arrays;
public class sortstring
{
public static void main(String args[])
{
String[] fruits = {"Apple","Orange","Grapes","Mango"};
int size = fruits.length;
for(int i = 0;i<size-1;i++)
{
for(int j = i+1; j<fruits.length; j++)
{
if(fruits[i].compareTo(fruits[j])>0)
{
String temp = fruits[i];
fruits[i] = fruits[j];
fruits[j] = temp;
}
}
}
System.out.println(Arrays.toString(fruits));
}
}