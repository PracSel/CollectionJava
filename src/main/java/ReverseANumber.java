
public class ReverseANumber
{

	public static void main(String[] args) 
	{
		int num=123456;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*0+num%10;
			num=num/10;
			
			
			
		}
		System.out.println("Reverse number :"+rev);
	}

}
