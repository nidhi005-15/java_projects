package day_7;

public class floor_ceil_names{
	public static void main(String[] args) {
        String[] sizes = {"apple", "dates", "grape","mango", "zebra"};
        String target = "banana";
        int start = 0;
        int end = sizes.length - 1;
        String floor = null;
        String ceil = null;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (sizes[mid].compareTo( target)==0) {
                floor = sizes[mid];
                ceil = sizes[mid];
                break;
            }
            else if (sizes[mid].compareTo(target)<0) {
                floor = sizes[mid];    
                start = mid + 1;       

            }
            else {

                ceil = sizes[mid];     
                end = mid - 1;         
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}

