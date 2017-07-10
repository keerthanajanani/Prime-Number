# Prime-Number
import java.io.*;
import java.util.*;
public class Prime Number
{
public static void main(String args[])throws IOException
{
int n,i,count=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Number:");
n=Integer.parseInt(br.readLine());
for(i=2;i<n;i++)
{
if(n%i==0)
{
count ++;
break;
}
}
if(count==0)
{
System.out.println("This is a prime Number");
}
else
{
System.out.println("This is not a prime Number");
}
}
}
