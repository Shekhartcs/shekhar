// EmpDemo.java
 import ep.Emp;
 import java.util.*;
class EmpDemo 
{
	public static void main(String[] args) 
	{
		Emp eo =new Emp();
		Stack al=eo.empDto();
		//for extracting emp details
		Enumeration en=al.elements();
		System.out.println("emp details are:");
		System.out.println("---------------------");
		while(en.hasMoreElements())
		{
			Object obj = en.nextElement();
			System.out.println(obj);
		}
	
System.out.println("------------------");
	}
}
