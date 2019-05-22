class factNo{
public static void main (String args []){
int i;
long fact=1;
int number=5;
for(i=1;i<=number;i++){
fact=fact*i;
}
System.out.println("factorial of "+number+"is:" +fact);
}
}