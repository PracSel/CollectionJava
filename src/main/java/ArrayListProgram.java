import java.util.ArrayList;

public class ArrayListProgram 
{

	public static void main(String[] args) 
	{
		ArrayList mylist=new ArrayList();//declaration of array
		
		//adding heterogeneous data in list 
		
		mylist.add(100);
		mylist.add('A');
		mylist.add("String");
		mylist.add(100);
		mylist.add(200);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println("ArrayList is :"+mylist);
		
		
		//reading data 
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		mylist.remove(0);
		
		System.out.println("Array List after removing data :"+mylist);
		
		ArrayList mylist1=new ArrayList();
		mylist1.add(0,33);
		mylist1.add(1,89);
		
		
	
		mylist.add(mylist1);
		
		System.out.println("Array List after adding  data :"+mylist);

	}

}
