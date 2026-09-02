package day_11;
public class Trie__ {

	    static class Node {
	        Node[] child = new Node[26];
	        boolean end;
	    }
	    static Node root = new Node();
	    static void insert(String word) {
	        Node curr = root;
	        for (char ch : word.toCharArray()) {
	            int index = ch - 'a';

	            if (curr.child[index] == null) {
	                curr.child[index] = new Node();
	            }

	            curr = curr.child[index];
	        }

	        curr.end = true;
	    }

	    public static void main(String[] args) {
	        insert("cat");
	        insert("car");
	        insert("can");
	        insert("cab");
	        insert("cap");
	        System.out.println("Words Inserted" );
	    }
	}