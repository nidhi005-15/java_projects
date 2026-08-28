package day_8;


import java.util.*;
class worker{
	String name;
	String department;
	int salary;
	worker(String name,String department,int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public String toString() {
		return name+" - "+department+" - "+salary;
		
	}
}
public class Demo_string  {
	public static void main(String[] args) {
		List<worker> employees=Arrays.asList(
			new worker("ravi","it",60000),
			new worker("anil","hr",50000),
			new worker("priya","it",50000),
			new worker("amit","hr",60000),
			new worker("rahul","at",50000)
			);
		employees.sort(
				Comparator.comparing((worker e)->e.salary,Comparator.reverseOrder())
         .thenComparing(e->e.name)
         );
         for(worker e:employees) {
        	 System.out.println(e);
		}
	}

}

