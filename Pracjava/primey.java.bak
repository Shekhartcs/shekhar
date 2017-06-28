import java.util.*;
class primey
{
	int a,count=0;
	void set(int n)
	{
	a=n;
	}
	void op()
	{
	for(int i=1;i<a;i++)
	{
	 if(a%i==0)
	 count++;
	}
	if(count==1)
		System.out.println("The given number is Prime");
	else
		System.out.println("The given number is Not Prime");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int x=Integer.parseInt(s.nextLine());
		primey o=new primey();
		o.set(x);
		o.op();
	}
}
