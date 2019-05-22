class trendyNo{
public static void main (String arg[]){
int div=0,r;
int n=464;
div=n;
while(n!=0){
r=n/10;
div=r%10;
n=n/10;
}
if(div%3==0)
System.out.println("trendy number");
else
System.out.println("not a trendy number");
}
}
