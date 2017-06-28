import java.util.*;
class hmtm 
{
	public static void main(String[] args) 
	{
		TreeMap hm=new TreeMap();
		System.out.println("content of hm is "+hm);
		System.out.println("size  of hm is "+hm.size());
		// adding the entry in 2D cfw variable
		hm.put(100,3.5f);
		hm.put(1,4.5f);
		hm.put(10,7.5f);
		hm.put(9,8.5f);
		hm.put(100,14.5f);
        System.out.println("content of hm is "+hm);
		System.out.println("size  of hm is "+hm.size());
		// extracting the data from 2D CFW var
       System.out.println("extracting the data using keySet>>set>>iterator");
	      System.out.println("------------------------------");
     Set s=hm.keySet();
	  Iterator itr= s.iterator();
	 while(itr.hasNext())
		{
		 Object kobj = itr.next();
		 Object vobj = hm.get(kobj);
		 Integer io = (Integer)kobj;
		 Float fo = (Float)vobj;
		 int acno=io.intValue();
		 float bal = fo.floatValue();
		 System.out.println(bal+"is the bal of "+acno);
			 }
			  System.out.println("extracting the data using keySet>>set>>iterator");
	          System.out.println("---------------------------------------------------------");
              System.out.println("extracting the data using entrySet>>set>>toArray");
	          System.out.println("---------------------------------------------------------");
	Set s1= hm.entrySet();
	Object  mobj[] = s1.toArray();
	for(int i=0;i<mobj.length;i++)
		{
Map.Entry me= (Map.Entry)mobj[i];// object typecasting
Object kobj= me.getKey();
Object vobj = me.getValue();
Integer acno = (Integer)kobj;
Float bal = (Float)vobj;		
System.out.println(bal+"is the balance of"+acno);
}
	
	}
}
