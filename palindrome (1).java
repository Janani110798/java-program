import java.io.*;
import java.util.*;
class Palindrome{
public static void main (String args []){
String s1,s2="";
Scanner s=new Scanner (System.in);
s1=s.nextLine();
int length=s1.length();
for(int i =length-1;i>=0;i--){
s2=s2+s1.charAt(i);
}
if(s1.equals(s2))
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}