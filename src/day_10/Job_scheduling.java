package day_10;

public class Job_scheduling {
	public static void main(String[] args) {
		char[] job = {'A','B','C','D','E'};
		int[] deadline = {2,1,2,1,3};
		int[] profit = {100,50,200,80,60};

		int n = job.length;

		// greedy step 1: sort jobs by profit, descending (selection sort)
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (profit[j] > profit[i]) {
					int tempProfit = profit[i]; profit[i] = profit[j]; profit[j] = tempProfit;
					int tempDeadline = deadline[i]; deadline[i] = deadline[j]; deadline[j] = tempDeadline;
					char tempJob = job[i]; job[i] = job[j]; job[j] = tempJob;
				}
			}
		}

		// find max deadline to know how many time slots exist
		int maxDeadline = 0;
		for (int i = 0; i < n; i++) {
			if (deadline[i] > maxDeadline) {
				maxDeadline = deadline[i];
			}
		}

		char[] slot = new char[maxDeadline];
		boolean[] filled = new boolean[maxDeadline];
		int totalProfit = 0;
		int jobsDone = 0;

		for (int i = 0; i < n; i++) {
			// greedy step 2: place this job as late as possible, before its deadline
			for (int t = deadline[i]-1; t >= 0; t--) {
				if (!filled[t]) {
					filled[t] = true;
					slot[t] = job[i];
					totalProfit += profit[i];
					jobsDone++;
					break;
				}
			}
		}

		System.out.println("Scheduled jobs:");
		for (int t = 0; t < maxDeadline; t++) {
			if (filled[t]) {
				System.out.println("Time " + (t+1) + ": Job " + slot[t]);
			}
		}
		System.out.println("Total jobs completed: " + jobsDone);
		System.out.println("Total profit: " + totalProfit);
	}
}
