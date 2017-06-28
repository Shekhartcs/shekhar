//FileDemo.java
import java.io.File;
class FileDemo 
{
	public static void main(String[] args) 
	{
		File f=new File("C:\Users\shekhar kumar\Desktop");
		boolean fileExists = file.exists();
		if(boolean==true)
		{System.out.println("file exist ");
		}
	else 
		System.out.println("not exist");
	/*	for(int i=0;i<s.length;i++)
		{
        System.out.println(s[i]);
			if(s[i].isDirectory())
			{
				String fn[]=s[i].list();
				for(int j=0;j<fn.length;j++)
					System.out.println(fn[j]);
			}
		}*/
	}
}
