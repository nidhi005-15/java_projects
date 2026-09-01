package day_10;

public class Jump_game {
	public static void main(String[] args) {
		int [] nums= {2,1,1,1,4};
		int maxreach=0;
		for(int i=0;i<nums.length;i++) {
			if(i>maxreach) {
				break;
			}
			maxreach=Math.max(maxreach, i+nums[i]);
		}
		if(maxreach>=nums.length-1) {
			System.out.println("Can reach the last position");
		}else {
			System.out.println("Cannot reach the last position");
		}
	}
	

}
