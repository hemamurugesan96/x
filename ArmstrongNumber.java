import java.io.*;
import java.util.*;
class ArmstrongNumber
{
public static void main(String[] args)
{
int a,p,sum=0;
for(int i=1;i<250;i++)
{
p=i;
while(p>0)
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
