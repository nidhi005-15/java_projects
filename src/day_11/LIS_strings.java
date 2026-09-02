package day_11;

public class LIS_strings {
	 public static void main(String[] args) {
			char[] arr= {'a','e','b','c','d','e'};
			int n=arr.length;
			int [] dp=new int[n];
			int max=0;
			for(int i=0;i<n;i++) {
				dp[i]=1;
				for(int j=0;j<i;j++) {
					if(arr[j]<arr[i]) {
						dp[i]=Math.max(dp[i],dp[j]+1);
					}
				}
				max=Math.max(max, dp[i]);
			}
			System.out.println("LTS Length = "+max);
		}

	}



