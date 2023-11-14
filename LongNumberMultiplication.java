import java.util.*;
public class LongNumberMultiplication
{
	public static void main(String[] args) {
		System.out.println("Enter  2 Long Number : ");
		Scanner sc=new Scanner(System.in);
		String n1;
		String n2;
		n1=sc.next();
		n2=sc.next();
// 1.Make 2 string equal

int l1=n1.length();
int l2=n2.length();
	if(l1!=l2){	
	    if(l1>l2){
	        int n=l1-l2;
	        for(int i=0;i<n;i++)
	        n2="0"+n2;
	    }
	    else{
	           int n=l2-l1;
	        for(int i=0;i<n;i++)
	        n1="0"+n1;
	    }
	}
	System.out.println(n1+" "+n2);
	
// 2.Divide equally and then convert to long int
 l1=n1.length();
 l2=n2.length();
int m=l1/2;
String a=n1.substring(0,m);
String b=n1.substring(m,l1);
String c=n2.substring(0,m);
String d=n2.substring(m,l2);

long a1= Long.parseLong(a);
long a2= Long.parseLong(b);
long b1= Long.parseLong(c);
long b2= Long.parseLong(d);
	System.out.println(a1+" "+a2);
	System.out.println(b1+" "+b2);
	

// 3.find c1=a*c
//       c2=b*d
//       c3=(a+b)*(c+d)-(c1+c2)
// c1*10^n+c3*10^n/2+c2


long c1=a1*b1;
long c2=a2*b2;
long c3=((a1+a2)*(b1+b2))-(c1+c2);
long ans = (long) (c1 * Math.pow(10, l1) + c3 * Math.pow(10, (int) (l1 / 2)) + c2);
	System.out.println(ans);
	}
}


