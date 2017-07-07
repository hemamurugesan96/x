import java.io.*;
import java.util.*;
class ArmstrongNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int a,p,sum=0,count=0;
for(int i=m;i<n;i++)
{
p=i;
while(i!=0)
{
a=p%10;
sum=sum+(a*a*a);
p=p/10;
}
if(sum==i)
{
System.out.print(i+" ");
}
sum=0;
}
}
}
