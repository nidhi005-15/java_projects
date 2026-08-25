package day_6;
public class String_builder_class {
	public static void main(String[] args) {
		StringBuilder x=new StringBuilder("Hello");
		x.append("world");
		System.out.println(x);
		x.insert(5,",");
		System.out.println(x);
		x.reverse();
		System.out.println(x);
		x.delete(0,11);
		System.out.println("string after deletion:"+x);
		}
	}

