import java.io.*;
import java.util.*;
class fibonacci{
public static void main(String[] arg){
int n,f=0,l=1,t,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(5<=n&&n<=100){
System.out.print(f+" "+l);
for(i=0;i<n-2;i++){
System.out.print(" ");
t=f+l;
f=l;
l=t;
System.out.print(t);

}
}

}



} 