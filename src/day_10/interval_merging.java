package day_10;

import java.util.Arrays;

public class interval_merging {
	// helper to convert "H:MM" into total minutes
	static int toMinutes(String time) {
		String[] parts = time.split(":");
		int hours = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1]);
		return hours * 60 + minutes;
	}

	// helper to convert total minutes back into "H:MM" for display
	static String toTimeString(int totalMinutes) {
		int hours = totalMinutes / 60;
		int minutes = totalMinutes % 60;
		return hours + ":" + (minutes < 10 ? "0" + minutes : minutes);
	}

	public static void main(String[] args) {
		String[][] rawIntervals = {{"9:00","10:00"}, {"9:30","11:00"}, {"10:00","11:00"},{"11:00","12:00"},{"11:30","13:00"}};
	

		int[][] intervals = new int[rawIntervals.length][2];
		for (int i = 0; i < rawIntervals.length; i++) {
			intervals[i][0] = toMinutes(rawIntervals[i][0]);
			intervals[i][1] = toMinutes(rawIntervals[i][1]);
		}

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int currentStart = intervals[0][0];
		int currentEnd = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];

			if (start <= currentEnd) {
				currentEnd = Math.max(currentEnd, end);
			} else {
				System.out.println("[" + toTimeString(currentStart) + "," + toTimeString(currentEnd) + "]");
				currentStart = start;
				currentEnd = end;
			}
		}
		System.out.println("[" + toTimeString(currentStart) + "," + toTimeString(currentEnd) + "]");
	}
}