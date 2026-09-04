package day_12;

public class Merge_linked_list {
    static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static node merge(node l1, node l2) {
        node dummy = new node(0);   
        node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        
        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;   
    }

    static void printList(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node first = new node(1);
        node second = new node(2);
        node third = new node(4);
        first.next = second;
        second.next = third;
        node first_1 = new node(1);
        node second_2 = new node(3);
        node third_3 = new node(4);
        first_1.next = second_2;
        second_2.next = third_3;

        node mergedHead = merge(first, first_1);
        printList(mergedHead);
    }
}