package day_9;
public class Binarysearchtree 
{
	static class node
	{
		int data;
		node left;
		node right;
		node(int data)
		{
			this.data=data;
		}
	}
	static node insert(node root,int data)
	{
		if(root==null) 
		{
			return new node(data);
		}
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else if(data>root.data) 
		{
			root.right=insert(root.right,data);
		}
		return root;
	}
	static void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	static void postorder(node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		}


	static void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
		}
	public static void main(String[] args) {
		node root = null;
		int[] values = {50,30,70,20,40,60};
		for (int v : values) {
		    root = insert(root, v);
		}
		System.out.print("Preorder: ");
	    preorder(root);
	    System.out.println();
	    System.out.print("Postorder: ");
	    postorder(root);
	    System.out.println();
	    System.out.print("Inorder: ");
	    inorder(root);
	    System.out.println();
	

	}
}
