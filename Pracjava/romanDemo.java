import java.util.Scanner;
class roman
{
	int a;
	void set(int n)
	{
	a=n;
	}
	void op()
	{
	if(a<=0)
	System.out.println("No raman equivalent is posssible...");
	else
	{
	 while(a>=1000)
       System.out.println("M");
	   a=a-1000;
	}
	if(a>=900)
	{
	System.out.println("CM");
	a=a-900;
	}
	if(a>=500)
	{
	System.out.println("D");
	a=a-500;
	}
	if(a>=400)
	{
	System.out.println("CD");
	a=a-400;
	}
	while(a>=100)
	{
	System.out.println("C");
	a=a-100;
	}
	if(a>=90)
	{
	System.out.println("XC");
	a= a-90;
	}
	if(a>=50)
	{
	System.out.println("L");
	a=a-50;
	}
	if(a>=40)
	{
	System.out.println("XL");
	a=a-40;
	}
	while(a>=10)
	{
	System.out.println("X");
	a=a-10;
     }
	 if(a>=9)
	{
	 System.out.println("IX");
	 a=a-9;
	 }
	 if(a>=5)
	{
	 System.out.println("V");
	 a=a-5;
	 }
	 if(a>=4)
	{
	 System.out.println("IV");
	 a=a-4;
	 
	 }
	 while(a>=1)
	{
		 System.out.println("I");
		 a=a-1;
	}
	}
}// business logic class
    
	class romanDemo
    {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the  number:");
		int x=Integer.parseInt(s.nextLine());
		roman p=new roman();
		p.set(x);
        p.op();		
    } 
}//Execution logic