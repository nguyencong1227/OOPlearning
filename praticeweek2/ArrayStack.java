public class ArrayStack implements Stack{

    public static final int CAPACITY = 1000;
    
    private int capacity;

    private Object a[];
    
    private int top=-1;
    
    public ArrayStack(){
        this(CAPACITY);
    }
    public ArrayStack(int cap){
        capacity=cap;
        a=new Object[capacity];
    }
    public int size(){
        return (top + 1);
    }

    public boolean isEmpty(){
        return (top<0);
    }
    public void push(Object obj)throws StackFullException{
        if(size()==capacity)
        throw new StackFullException("Stack overflow");
        a[++top]=obj;
    }

    public Object top() throws StackEmptyException{
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        return a[top];
    }
    public Object pop() throws StackEmptyException{
        Object elem;
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        elem =a[top];
        a[top--]=null;
        return elem;
    }
}