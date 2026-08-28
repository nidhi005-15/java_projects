package day_8;

import java.util.LinkedList;
import java.util.Queue;

public class sliding_window_queue {

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 2, 9, 7, 3};
        int k = 3;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);   

            
            if (queue.size() > k) {
                queue.remove();
            }

            
            if (queue.size() == k) {
                int max = findMax(queue);
                System.out.println("Window: " + queue + " -> Max: " + max);
            }
        }
    }

    static int findMax(Queue<Integer> queue) {
        int max = 0;
        for (int num : queue) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}