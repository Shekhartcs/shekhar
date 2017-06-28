import java.util.*;
class oddy
{
	int a;
	void set(int n)
	{
	a=n;
	}
	void op()
	{
	int t=a%2;
	if(t==0)
		System.out.println("The given number is EVEN");
	else
		System.out.println("The given number is ODD");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int x=Integer.parseInt(s.nextLine());
		oddy o=new oddy();
		o.set(x);
		o.op();
	}
}
