import  sp.phoneBook;
import java.util.*;
class PhoneDemo 
{
	public static void main(String[] args)
	{
		Scanner x= new Scanner(System.in);
		int ch=0;
		phoneBook po =new phoneBook();
 while(true)
		{
	System.out.println("\n 1.inserContacts \n 2.displayPhoneBook \n 3.searchPhoneBook \n 4.exit");
    System.out.println("Enter your choice");
	ch= Integer.parseInt(x.nextLine());
switch(ch)
	{
     case 1:po.insertContacts();
	 break;
	 case 2:po.displayPhoneBook();
	 break;
	 case 3: po.searchPhoneBook();
	 break;
	 case 4:System.exit(0);
	 default: System.out.println("enter  choice  is wrong");
	}
}
	}
}