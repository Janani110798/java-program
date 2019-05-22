import java.io.*;
import java.util.*;
class pattern {
public static void main (String args []){
int n,c,d,num=1;
Scanner s = new Scanner (System.in);
n=s.nextInt();
for ( c=1;c<=n;c++){
for(d=1;d<=c;d++){
System.out.println (num+"");
num++;
}
System.out.println ();
}
}
}