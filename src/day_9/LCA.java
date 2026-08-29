package day_9;
public class LCA {
	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
		}
	}
	static node findlca(node root,int n1,int n2) {
		if(n1<root.data && n2<root.data ) {
			return findlca(root.left,n1,n2);
		}
		if(n1>root.data && n2>root.data ) {
			return findlca(root.right,n1,n2);
	}
		return root;

}
	public static void main(String[] args) {
		node root=new node(10);
		root.left=new node(5);
		root.right=new node(15);
		root.left.left=new node(2);
		root.left.right=new node(7);
		root.right.left=new node(12);
		root.right.right=new node(25);
		node result=findlca(root,2,7);
		System.out.println("LCA:"+result.data);
	}
	}
