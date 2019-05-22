import java.io.*;
import java.util.*;
class primeNo{
public static void main(String[] args){
int l,b,i,j,count,f=0;
Scanner s=new Scanner(System.in);
l=s.nextInt();
b=s.nextInt();
for(i=l;i<=b;i++){
count=0;
if(i==1)
count=1;
for(j=2;j<i;j++){

if(i%j==0){
count++;
}

}
//System.out.println("count "+count +"i "+i)
  if(count==0){
  System.out.print(i+" ");
  f=i;
  }
}
System.out.print(f);
}
}