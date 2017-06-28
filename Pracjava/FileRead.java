//FileRead.java 
import java.io.*;
import java.util.*;
class FileRead 
{
	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the name of the file:");
			String fname=s.nextLine();
			fis=new FileInputStream(fname);
			int x;
            while((x=fis.read())!=-1)
			{
				//char ch=(char)x;
            System.out.print(x);
			}
		  System.out.println("file is read");
		}catch(FileNotFoundException fe)
		{
			System.err.println("file does not exist");
		}catch(IOException ioe)
		{
			System.err.println("unable to read from corrupted file");
		}
		finally
		{
			try
			{
				if(fis!=null)
				fis.close();
				System.out.println("file is closed");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}//finally
	}//main
}//class
//FileWrite.java 
import java.io.*;
import java.util.*;
class FileWrite 
{
	public static void main(String[] args) 
	{
		FileOutputStream fos=null;
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the nsme of the file:");
			String fname=s.nextLine();
			fos=new FileOutputStream(fname,true);
			for(int i=0;i<=10;i++)
			{
				fos.write(i);
			}
           System.out.println("file is written");
		}catch(IOException ioe)
		{
			System.err.println("unable to open the file");
		}catch(Exception e)
		{
			System.err.println(e);
		}
		finally
		{
			try
			{
				if(fos!=null)
				fos.close();
				System.out.println("file is closed");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}//finally
	}//main
}//class
ÿ