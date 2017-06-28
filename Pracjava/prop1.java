//prop1.java
import java.util.*;
import java.io.*;
class prop1 
{
	public static void main(String[] args) 
	{
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the file name");
			String pfile=s.nextLine();
			FileInputStream fis=new FileInputStream(pfile);
			Properties p=new Properties();
			p.load(fis);
			System.out.println("student number is: \n"+p.getProperty("stno"));
			System.out.println("student  name is: \n"+p.getProperty("name"));
			System.out.println("student marks is: \n"+p.getProperty("mark"));
			fis.close();
		}catch(FileNotFoundException fe)
		{
			System.out.println("file does not exist");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
