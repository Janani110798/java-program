import java.io.*;
import java.util.*;
class denom{
public static void main (String args []){
int amount=575;
int i;
int arr []={500,200,100,50,20,10,5,1};
int note[]=new int[8];
for (i=0;i<8;i++){
if (amount >=arr[i]){
 note[i]=amount/arr[i];
 amount -=(note[i]*arr[i]);
}
}
for(i=0;i<8;i++)
{
System.out.println (note[i]);
}
}
}