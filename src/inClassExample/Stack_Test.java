package inClassExample;

public class Stack_Test 
{
	static long Tight_Time;
	static long Growth_Time;
	
	public static void main(String[] args)
	{
		Tight_Strategy();
		Growth_Strategy();
		System.out.println("Tight Algorithm Time Of Completion: " + Tight_Time + "ms");
		System.out.println("Growth Algorithm Time Of Completion: " + Growth_Time + "ms");	
	}
	
	private static void Tight_Strategy()
	{
		ArrayStack AS = new ArrayStack(1024);
		try
		{	
			long startTime = System.currentTimeMillis();
			for (int i = 0; i <= 1000000; i++)
			{
				AS.push_tight(i);
			}
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			Tight_Time = totalTime;
		}
		catch(StackFullException e1)
		{
			System.out.println("Stack is Full");
		}
		
	}
	
	private static void Growth_Strategy()
	{
		try
		{	
			ArrayStack BS = new ArrayStack(1024);
			long startTime = System.currentTimeMillis();
			for (int i = 0; i <= 1000000; i++)
			{
				BS.push_growth(i);
			}
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			Growth_Time = totalTime;
		}
		catch(StackFullException e1)
		{
			System.out.println("Stack is Full");
		}
	}
}
