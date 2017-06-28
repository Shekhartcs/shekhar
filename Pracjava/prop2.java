//prop2 .java
import java.util.*;
class prop2 
{
	public static void main(String[] args) 
	{
		Properties p=System.getProperties();
		
		Enumeration en =p.keys();
		while(en.hasMoreElements())
		{
			Object evn = en.nextElement();
			Object evv =p.get(evn);
			System.out.println(evn+"---------->>"+evv);
		}
		
	}
}
