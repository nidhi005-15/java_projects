package day_4;
public class marks_condition {
		public static void main(String[] args) {
			int [] marks= {35, 67, 89, 22, 45, 30, 76};
			int pass=0;
			for(int i=0;i<marks.length;i++) {
				if(marks[i]>40)
					pass++;
			}
			System.out.print("no of students who have passed:"+pass);
}
}


