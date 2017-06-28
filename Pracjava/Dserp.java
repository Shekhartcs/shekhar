//Dserp.java
import rp.Student;
import java.io.*;
import java.util.*;
class Dserp 
{
	public static void main(String[] args) 
	{
	try
		{	
		Student so=new Student();
		Scanner s=new Scanner(System.in);
       System.out.println("Enter the name of the file:");
	   String fname=s.nextLine();
	   FileInputStream fis=new   FileInputStream(fname);
	   ObjectInputStream ois=new ObjectInputStream(fis);
	  Object obj=ois.readObject();
		
		  so=(Student)obj;
	   System.out.println("Student no is:"+so.getStno());
	      System.out.println("Student name is:"+so.getName());
		     System.out.println("Student marks is:"+so.getMarks());
	   ois.close();
	   fis.close();
	}catch(IOException ioe)
	{
	System.out.println("unable to open  the file:");	
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}
}