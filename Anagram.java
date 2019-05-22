import java.util.*;
public class Anagram{
public static void main(String args[]){
String s1,s2;
int l,l1,l2,i,j,found=0,not_found=0;
Scanner s= new Scanner(System.in);
s1=s.nextLine();
s2=s.nextLine();
l1=s1.length();
l2=s2.length();
if(l1==l2){
l=l1;
for(i=0;i<l;i++){
found=0;
for(j=0;j<l;j++){
if(s1.charAt(i)==s2.charAt(j)){
found=1;
break;
}
}
if(found==0){
not_found=1;
break;}
}
if(not_found==1)
System.out.println("String are not anagram");
else
System.out.println("String are anagram");
}
}
}