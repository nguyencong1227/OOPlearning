public interface Stack {
    public int size();
    
    public boolean isEmpty();
    
    public Object top() throws StackEmptyException;
    
    public void push(Object element) throws StackFullException;
    
    public Object pop() throws StackEmptyException;
}
