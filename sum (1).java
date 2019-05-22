import java.io.*;
import java.util.*;
class sum{
public static void main (String args[]){
int n,m,sum=0;
Scanner s= new Scanner (System.in);
n=s.nextInt();
while(n!=0){
m=n%10;
sum=sum+m;
n=n/10;
}
System.out.println("sum of the digits"+sum);
}
}


