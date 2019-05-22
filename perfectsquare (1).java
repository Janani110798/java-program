import java.io.*;
import java.util.*;
class perfectsquare{
public static void main (String args []){
Scanner s = new Scanner (System.in);
int a = s.nextInt();
int sqrt =(int) Math.sqrt(a);
if (sqrt*sqrt==a)
System.out.println ("perfect square ");
else
System.out.println("not a perfect square");
}
}
