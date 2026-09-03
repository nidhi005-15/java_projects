package day_12;

public class KMP {
	static void search(String text, String pattern) {
	        int n = text.length();
	        int m = pattern.length();
	        int[] lps = new int[m];
	        for (int i = 1, len = 0; i < m;) {
	            if (pattern.charAt(i) == pattern.charAt(len)) {
	                lps[i++] = ++len;
	            }
	            else if (len > 0) {
	                len = lps[len - 1];
	            }
	            else {
	                lps[i++] = 0;
	            }
	        }
	        for (int i = 0, j = 0; i < n;) {
	            if (text.charAt(i) == pattern.charAt(j)) {
	                i++;
	                j++;
	            }
	            if (j == m) {
	                System.out.println("Pattern found");
	                return;
	            }
	            else if (i < n && text.charAt(i) != pattern.charAt(j)) {
	                if (j > 0)
	                    j = lps[j - 1];
	                else
	                    i++;
	            }
	        }
	        System.out.println("Pattern not found");
	    }

	    public static void main(String[] args) {
	        search("ABABDABACDABABCABAB", "ABABCABAB");
	    }
	}


