import java.util.*;
class AlgSort 
{
	public void sortRevData()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the no of names you want to sort: ");
			int n =Integer.parseInt(s1.nextLine());
			String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
         System.out.println("Enter the  names"+(i+1)+" you want to sort: ");
			  s[i] = s1.nextLine();
		}
	List<String>l=Arrays.asList(s);
	System.out.println("Names in original order : ");
	System.out.println(l);
	System.out.println("Names in the  reversed ordered: ");
	System.out.println("----------------------------------------- ");
	Collections.reverse(l);
	System.out.println(l);
	System.out.println("------------------------------------------- ");
    System.out.println("Names in the  sorted ordered: ");
	System.out.println("----------------------------------------- ");
	Collections.sort(l);
    System.out.println(l);
	System.out.println("------------------------------------------- ");
}	
}
class MortDemo
{
public static void main(String args[])
	{
	AlgSort o=new AlgSort();
	o.sortRevData();
	}
}