import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

int a,d=0,j=0,e;
int i;
char b[]=new char[10];
Scanner s=new Scanner(System.in);
a=s.nextInt();
e=a;
while(a>0)
{
d=a%10;
j=(j*10)+d;
a=a/10;
}
if(e==j)
System.out.println("YES");
else
System.out.println("NO");
}
}
	
