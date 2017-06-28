//Emp.java
package ep;
import java.util.*;
public class Emp
  {
	public  Stack empDto()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the employe no");
		int emno=Integer.parseInt(s.nextLine());
       System.out.println("enter the employe name");
	   String ename=s.nextLine();
	   System.out.println("enter the employe salary");
	   float empsal=Float.parseFloat(s.nextLine());
	   // add  a CFW to reterive the emp details
	   Stack al=new Stack();
	   al.addElement("employe no is"+emno);
	   al.addElement("employe name is"+ename);
	   al.addElement("employe sal"+empsal);
	   return al;
}
}
