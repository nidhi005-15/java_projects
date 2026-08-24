package day_5;

public class rabin_karp_pattern_matching {
	public static void main(String[] args) {
		String text="I love Java programming";
		String pattern="Java";
		int position=search(text,pattern);
		if(position!=-1) {
			System.out.println("pattern found at index:"+position);
		}else {
			System.out.println("pattern not found");
		}
	}
	static int search(String text,String pattern){
		int n=text.length();
		int m=pattern.length();
		int patternhash=getHash(pattern);
		for(int i=0;i<=n-m;i++) {
			String part=text.substring(i,i+m);
			int parthash=getHash(part);
				if(patternhash==parthash) {
					if(part.equals(pattern)) {
						return i;
			}
		}
		}
	return -1;
}
	static int getHash(String str) {
		 int hash=0;
		 for(int i=0;i<str.length();i++) {
			 hash=hash+str.charAt(i);
		 }
		 return hash;
	}
}



