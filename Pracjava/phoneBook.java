 package  sp;
 import java.util.*;
public class  phoneBook
{
	TreeMap pop= new TreeMap();
	Scanner s=new Scanner(System.in);
		
	public void insertContacts()
	{
		System.out.println("how many no you want to have in contact");
		int n = Integer.parseInt(s.nextLine());
		for(int i=0;i<=n;i++)
		{
       System.out.println(" Enter the   "+(i+1)+"  conact details");
		 System.out.println(" -----------------------------");
		 System.out.println(" Enter the contact name");
		 String cname = s.nextLine();
		 System.out.println(" Enter contact no:");
		 int phno = Integer.parseInt(s.nextLine());
		 pop.put(cname,phno);
		 System.out.println("---------------------");
		}// for
	}//create phonebook details
	public void displayPhoneBook()
	{
		if (pop.size()<=0)
		{
			System.out.println("phonebook is empty");		
				}
				else
		{
	System.out.println("phonebook  details");
		System.out.println("-----------------------");
		Set s = pop.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
			{
			Object mobj = itr.next();
			Map.Entry  me = (Map.Entry)mobj;
			Object cname = me.getKey();
			Object phno = me.getValue();
			System.out.println(cname+"has phone no:"+phno);
			System.out.println("-----------------------");

		}//while
			}//else
	}//display phone details
	public void searchPhoneBook()
	{
     if(pop.size()<=0)
		 {
		 System.out.println("phonebook is empty");
	 }//if
	 else
		{
         System.out.println("enter contact name");
		 String cname = s.nextLine();
		 Object phno = pop.get(cname);
		 if(phno!=null)
			{
              System.out.println(phno+" is phone no of"+cname);
              }//if
			  else
			{
				  System.out.println("phone no does exit");
			}//else

		}//else
	}// searchphone book
}
