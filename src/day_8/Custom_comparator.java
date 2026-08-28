package day_8;
import java.util.*;
class employee{
	String name;
	String department;
	int salary;
	employee(String name,String department,int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public String toString() {
		return name+" - "+department+" - "+salary;
		
	}
}
public class Custom_comparator {
	public static void main(String[] args) {
		List<employee> employees=Arrays.asList(
			new employee("ravi","it",60000),
			new employee("anil","hr",50000),
			new employee("priya","it",50000),
			new employee("amit","hr",60000),
			new employee("rahul","at",50000)
			);
		employees.sort(
				Comparator.comparing((employee e)->e.department)
		.thenComparing((employee e)->e.salary,Comparator.reverseOrder())
         .thenComparing(e->e.name)
         );
         for(employee e:employees) {
        	 System.out.println(e);
		}
	}

}
