import java.util.*;
import java.io.*;
public class BST {
	public static void main (String [] args) {
		BST tree = new BST();
		int n;
                Scanner scanner = new Scanner(System.in);
                do{
                        System.out.print("enter number of element: ");
                        n = scanner.nextInt();
                }while (n<0);

                System.out.println("enter element: ");
                for (int i = 0; i < n; i++){
                        System.out.print("enter the element " + (i+1) + ": ");
			int temp = scanner.nextInt();
                        tree.insert(temp);
                }
		tree.inorder();
	}
	class Node{
		int key;
		Node left, right;

		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	Node root;

	BST(){
		root = null;
	}

	//This method mainly calls insertRec()
	void insert(int key){
		root = insertRec(root, key);
	}

	// A recursive funtion to insert a new key in BST
	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if ( key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}
	void inorder(){
		inorderRec(root);
	}


	void inorderRec(Node root)
	{
		if(root != null){
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

}
