class consi
{
	int a,b;
	consi()
	{
	System.out.println("Hai I m from default comstructor...");
	a=10;
	b=20;
	System.out.println("The value of a:"+a);
	System.out.println("The value of b:"+b);
	}
	consi(int m,int n)
	{
	a=m;
	b=n;
	System.out.println("Hai I m from parametrize comstructor...");
	System.out.println("The value of a:"+a);
	System.out.println("The value of b:"+b);
	}
	consi(consi x)
	{
	System.out.println("Hai I m form object parametrize constructor:");
	a=x.a;
	b=x.b;
	System.out.println("the value of a:"+a);
	System.out.println("The value of b:"+b);
	}
	public static void main(String[] args) 
	{
		consi co=new consi();
		consi co1=new consi(12,25);
		consi c02=new consi(co1);
	}
}
