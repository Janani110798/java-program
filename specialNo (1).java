import java.io.*;
import java.util.*;
class SpecialNo{
public static void main (String args[]){
int n,mul=1,sum=0,copy,r;
Scanner s =new Scanner (System.in);
n=s.nextInt();
copy=n;
while(n!=0){
r=n%10;
sum=sum+r;
mul=mul*r;
n=n/10;
}
if(copy==mul+sum)
System.out.println("special number");
else
System.out.println("not a specail number");
}
}