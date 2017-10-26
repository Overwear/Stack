package inClassExample;

public interface Stack 
{
	public Object top() throws StackEmptyException;
	public Object pop() throws StackEmptyException;
	public void push(Object obj) throws StackFullException;
}
