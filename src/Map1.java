import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//public class Map1 {
//	public static void main(String args[]) {
//			Map<Integer,String> map = new HashMap<Integer,String>();
//			map.put(1, "Dudu");
//			map.put(2, "susu");
//			map.put(3, "Gugu");
//			map.put(4, "Nunu");
//			System.out.println(map.get(3));
//			
//			map.remove(1);
//			System.out.println(map.get(1));
//	}
//
//}


//public class Map1 {
//public static void main(String args[]) {
//		Map<Integer,String> map = new HashMap<Integer,String>();
//		map.put(1, "Dudu");
//		map.put(2, "Susu");
//		map.put(3, "Gugu");
//		map.put(4, "Nunu");
//		
//		
//		
//		Set<Integer> keyset = map.keySet();
//		for(int key : keyset) {
//			System.out.println( "The key is " +key+" and the value is "+map.get(key));
//			
//		}
//}
//


class Employees{
	 int id;
	 int salary;
	 String name;
	
	 public Employees(int id, int salary,String name){
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
		 
		}
	 public String toString() {
			return "Name is " + name + " salary is " +salary;
	
	
	 }
}
public class Map1 {
	public static void main(String args[]) {
	
	Employees emp1 = new Employees(01,45000,"Druti");
	Employees emp2 = new Employees(02,50000,"Megha");
	Employees emp3 = new Employees(03,67000,"Shreya");
	Employees emp4 = new Employees(04,89000,"Ritu");
	
	
	Map<Integer,Employees> map = new HashMap<Integer,Employees>();
	List<Employees> list = new ArrayList<Employees>();
	map.put(emp1.id, emp1);
	map.put(emp2.id, emp2);
	map.put(emp3.id, emp3);
	map.put(emp4.id, emp4);
	System.out.println(map.get(emp1.id));
	
	Set<Integer> keyset = map.keySet();
	for(int val: keyset ) {
		if(map.get(val).salary>=50000) {
			System.out.println(map.get(val));
			
		}
		for(Employees ep : list) {
			System.out.println(ep);
		}
	}
	
	
}		
		
}



