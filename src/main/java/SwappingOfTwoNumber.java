
public class SwappingOfTwoNumber 
{

	public static void main(String[] args)
	{
		int a=10;
		int b=40;
		
		System.out.println("Number Before Swapping :"+a +b);
		
		a=a*b;//10*40=400
		b=a/b;//400/40=10
		a=a/b;//400/10=40
		
		
		System.out.println("Number After Swapping :" +a  +b);
	}

}
