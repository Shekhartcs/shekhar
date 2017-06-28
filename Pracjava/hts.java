import java.util.*;
class hts 
{
	public static void main(String[] args) 
	{
		TreeSet s=new TreeSet();
		System.out.println("content of s="+s);
		System.out.println("size of s="+s.size());
		s.add(100);
		s.add(1);
		s.add(20);
		s.add(34);
		s.add(90);
		s.add(90);
        System.out.println("content of s="+s);
		System.out.println("size of s="+s.size());
		System.out.println("extracting the data using Iterator()>>>>>> in forward direction");
		Iterator   itr   =  s. iterator();
		while(itr.hasNext())
		{
			Object   obj  =    itr.next();
			System.out.println(obj);
		}
		System.out.println("extracting the data in backward direction using>>> toarray");
       Object obj1[]=s.toArray();
	   for(int i=obj1.length-1;i>=0;i--)
		{
		   System.out.println(obj1[i]);
		}
          System.out.println("in random order element at last="+obj1[s.size()-1]);

	}
}
