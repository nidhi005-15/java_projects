package day_5;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_iteration {
    public static void main(String[] args) {
        
        HashSet<String> num = new HashSet<>();
        
        num.add("C");
        num.add("A");
        num.add("E");
        num.add("B");
        num.add("D");  
        num.add("F");
        num.add("F"); // Duplicate ignored
        num.add("F");
        num.add("F");
        num.add(null); // Null value allowed

        System.out.println("size of hashset before adding elements: " + num.size());
        System.out.println("hashset is empty before adding values: " + num.isEmpty());
        System.out.println("contents of hashset before adding values: " + num);
        
        boolean b1 = num.contains("E");
        System.out.println("Value E is present: " + b1);
        boolean b2 = num.contains("R");
        System.out.println("Value R is present: " + b2);
        
        num.remove("B");
        System.out.println("size of hashset after deletion: " + num.size());
        System.out.println("contents of hashset after deletion: " + num);

        
        System.out.print("Iterator output: ");
        Iterator<String> iterator = num.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            System.out.print(e + " ");
        }
        System.out.println(); 

        
        System.out.println("For Loop output:");
        for (String element : num) {
            System.out.println(element);
        }
    }
}