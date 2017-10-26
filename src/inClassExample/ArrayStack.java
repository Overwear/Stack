package inClassExample;

public class ArrayStack implements Stack
{
	public static final int CAPACITY = 1024;
	
	private int N;
	private Object S[];
	private int t = -1;
	private Object A[];
	public ArrayStack()
	{
		this(CAPACITY);
	}
	
	public ArrayStack(int cap)
	{
		N = cap;
		S = new Object[N];
	}
	
	public Object top() throws StackEmptyException
	{
		if(isEmpty())
		{
			throw new StackEmptyException("Stack is Empty");
			
		}
		return S[t];
	}
	
	public Object pop() throws StackEmptyException
	{
		Object elem;
		if(isEmpty())
		{
			throw new StackEmptyException("Stack is Empty");
		}
		elem = S[t];
		S[t--] = null;
		return elem;
	}
	
	public int size()
	{
		return(t + 1);
	}
	
	public boolean isEmpty()
	{
		return(t<0);
	}
	
	public void push_tight(Object obj) throws StackFullException
	{
		if(size() == N)
		{
			//throw new StackFullException("Stack overflow");
			int N_new = N+5;
			A = new Object[N_new];
			for(int i = 0; i < N; i++)
			{
				A[i] = S[i];
			}
			S = A;
			t = t + 1;
			S[t] = obj;
			N = N_new;
			
		}
		else
		{
			S[++t] = obj;
		}
	}
	
	public void push_growth(Object obj) throws StackFullException
	{
		if(size() == N)
		{
			//throw new StackFullException("Stack overflow");
			int N_new = 2*N;
			A = new Object[N_new];
			for(int i = 0; i < N; i++)
			{
				A[i] = S[i];
			}
			S = A;
			t = t + 1;
			S[t] = obj;
			N = N_new;	
		}
		else
		{
			S[++t] = obj;
		}
	}

	@Override
	public void push(Object obj) throws StackFullException 
	{
		// TODO Auto-generated method stub
		
	}
	
}
