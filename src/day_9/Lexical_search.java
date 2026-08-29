package day_9;
import java.util.ArrayList;

public class Lexical_search {
	public static void main(String[] args) {
			long [] names= {9845612121L,9845147121L,9843651451L,9845796633L,994577885l};
			String search="984";
			ArrayList<String> result=new ArrayList<>();
			for(long name:names) {
				String nameStr=String.valueOf(name);
				if(nameStr.contains(search)) {
					result.add(nameStr);
				}
			}
			System.out.println("search results");
			for(String name:result) {
				System.out.println(name);
			}
		}

	}



