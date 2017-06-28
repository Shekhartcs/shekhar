class multi
{
	int a,b,m;
	void set(int n,int m)
	{
	 a=n;
	 b=m;
	}
	void multi()
	{
	  m=a*b;
	}
	void display()
	{
	System.out.println("The multiplication of number is"+m);
	}
	public static void main(String k[])
	{
		int x=0,y=0;
		if(k.length!=2)
		{
		System.out.println("Please enter Two value for multiplication:");
		}
		else
		 x=Integer.parseInt(k[0]);
		 y=Integer.parseInt(k[1]);
         multi mo=new multi();
		 mo.set(x,y);
		 mo.multi();
		 mo.display();
	}
}
