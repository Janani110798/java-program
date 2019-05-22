import java.io.*;
import java.util.*;
class foobar{
public static void main (String args []){
int a,b,c,d;
Scanner s = new Scanner(System.in);
a=s.nextInt ();
b=s.nextInt ();
c=s.nextInt ();
d=s.nextInt ();
if (a%3==0){
System.out.println("foo");
}
 if (b%5==0){
System.out.println("bar");
}
 if (c%3==0 && c%5==0){
System.out.println("foobar");
}
 if (d%3!=0 && d%5 !=0){
System.out.println("none");
}
}
}

