
import static java.lang.System.exit;

class Stack_linker {
    private class Node {
        int data;
        Node link;
    }

    //create global top reference cariable global
    Node top;

    Stack_linker()
    {
        this.top = null;
    }

    // utility fuction to add an element x in the stack
    public void push(int x)
    {
        Node temp = new Node();

        temp.data = x;
        temp.link = top;
        top = temp;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    //Utility function to return top element in a stack
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop()
    {
        if (top == null) {
            System.out.println("Stack is Underflow");
            return;
        }

        top = (top).link;
    }

    public void display()
    {
        if (top == null) {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.print(temp.data + "->");

                temp = temp.link;
            }
        }
    }
    public static void main(String[] args)
    {
        // create Object of Implementing class
        Stack_linker obj = new Stack_linker();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
 
        // print Stack elements
        obj.display();
 
    }
}
