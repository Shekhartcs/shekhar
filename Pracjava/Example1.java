class Example1 
{
	public static void main(String[] args) throws Exception
	{
		Thread t=new Thread();
		for(int i=0;i<10;i++){
		System.out.println(i);
		t.sleep(1000);
		}
		
	}
}
