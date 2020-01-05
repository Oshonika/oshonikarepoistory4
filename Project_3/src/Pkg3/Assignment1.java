package Pkg3;

public class Assignment1 {


public int sum(int a,int b)
{
int sum;
sum=a+b; 
System.out.println("Sum = " + sum);
return sum;
}
public int sub(int c,int d)
  {
   int sub;
	sub=c-d;
	System.out.println("Sub = " + sub);
	return sub;
  }
 public int mul(int e,int f)
 {
 int mul;
 mul=e*f;
 System.out.println("mul = " + mul);
 return mul;
 }
 public void div(int g,int h)
 {
	 int div;
	 div=g/h;
	 System.out.println("Final Result of ((((10+2)-2)+2)*2)/2) = " + div);	
 }
 public static void main(String[] args)
 {
	 Assignment1 s=new Assignment1();
	 int sum=s.sum(10,2);
	 int sub=s.sub(sum,2);
	 int sum1=s.sum(sub,2);
	 int mul=s.mul(sum1,2);
	 s.div(mul, 2);
 } 
	 
}	 
	 
	 
	 
	 
	 
	 
	
	
			

 
