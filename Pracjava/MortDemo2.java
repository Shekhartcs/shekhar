import java.util.*;
class AlgSort 
{
	public void sortRevData()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the no of element you want to sort: ");
			int n =Integer.parseInt(s1.nextLine());
			Integer s[]=new Integer[n];
		for(int i=0;i<n;i++)
		{
         System.out.println("Enter the  "+(i+1)+" element , you want to sort: ");
			  s[i] =Integer.parseInt(s1.nextLine());
		}
	List<Integer>l=Arrays.asList(s);
	System.out.println("Number in original element: ");
	System.out.println("=============== ");
	System.out.println(l);
   System.out.println("Number in sorted order ");
	System.out.println("=============== ");
	Collections.sort(l);
	System.out.println(l);
   System.out.println("Enter the element of which binary search u want");
	int z= Integer.parseInt(s1.nextLine());
	int fv=Collections.frequency(l,z);
System.out.println("position of the no is"+fv);

}	
}
class MortDemo2
{
public static void main(String args[])
	{
	AlgSort o=new AlgSort();
	o.sortRevData();
	}
}
