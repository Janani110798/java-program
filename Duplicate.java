import java.util.*;
public class Duplicate{
public static void main(String args[]){
String s1="IndependenceDay";
char[] c=s1.toCharArray();
int l=c.length;
int i,k,j,temp=0;
System.out.println("String with duplicates:"+s1);
for(i=0;i<l;i++){
for(j=i+1;j<l;j++){
if(c[i]==c[j]){
temp=j;
for(k=temp;k<l-1;k++){
c[k]=c[k+1];
}
j--;
l--;
}
}
}
String s2=new String(c);
s2=s2.substring(0,l);
System.out.println("String without duplicates:"+s2);
}
}