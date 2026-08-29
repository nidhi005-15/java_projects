package day_9;

public class Trees {
	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
		}
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
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
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