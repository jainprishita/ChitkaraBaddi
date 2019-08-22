import java.util.Scanner;
public class abc
{
int input(int a,int b)
{
int c;
c=a+b;
return(c);
}}
class call
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
abc obj=new abc();


System.out.println("enter the value of c");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(obj.input(a,b));
}
}


