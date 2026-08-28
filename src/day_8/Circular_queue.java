package day_8;

public class Circular_queue {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {
        if ((rear + 1) % queue.length == front) {
            System.out.println("queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            System.out.println(value + " added");
        }
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("queue is empty");
        } else {
            System.out.println(queue[front] + " removed");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % queue.length;
            }
        }
    }

    static void display() {
        System.out.println("queue available elements:");
        if (front == -1) {
            System.out.println("(empty)");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        display();

        dequeue();
        dequeue();
        display();

        enqueue(60);   
        enqueue(70);
        display();
    }
}