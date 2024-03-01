import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Collections1 {
//	public static void main (String[]args) {
//		List list = new ArrayList();
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		
//		list.add(2);
//		list.add(4);
//		list.add(10); // we can pass premitive data also.
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		
//		list.add(3, 48);
//		System.out.println(list);
//		System.out.println(list.get(2));
//	}
//
//}





//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Collections1 {
//	
//	public String toString() { // over riding with tostring method.....
//		return "hiiii";
//	}
//	public static void main (String[]args) {
//		List list = new ArrayList();
//		Collections1 c1 = new Collections1();
//		
//		
//		list.add(2);
//		list.add(4);
//		list.add(10); // we can pass premitive data also.
//		
//		
//		list.add(3, 48);
//		list.add("Druti");
//		list.add(c1);
//		
//		
//		// classic for loop
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		// enhanced for loop
//		for(Object o :list) { // object is parent of every class..
//			System.out.println(o);
//		}
//	}
//
//}






// REMOVE METHOD

//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Collections1 {
//	
//	
//	public static void main (String[]args) {
//		List<Integer> list = new ArrayList<Integer>(); // if we pass any datatype particularly in this <> angular
//		                               // bracket it will be only applicable to print the integer type data..
//		      // premitive to wrapper class (boxing)
//		
//		
//		list.add(2);
//		list.add(4);
//		list.add(10); // we can pass premitive data also.
//		
//		
//		list.add(3, 48);
//		
//		Integer removalElement = 2; // wrapper class to premitive(unboxing)
//		
//		
//		for(int i : list) {
//			System.out.println(i);
//		}
//	
//		System.out.println("The removed element is:" +list.remove(removalElement));
//		System.out.println("After removal");
//		
//		for(int i : list) {
//			System.out.println(i);
//		}
//	
//		
//
//	}
//
//}



// EQUALS METHOD
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Collections1 {
//	
//	
//	public static void main (String[]args) {
//		List<Integer> list1 = new ArrayList<Integer>(); 
//		List<Integer> list2 = new ArrayList<Integer>(); 
//		
//		list1.add(4);
//		list2.add(8);
//		list1.add(10);
//		list2.add(4);
//		
//		
//	
//		System.out.println(list1==list2);
//		System.out.println(list1.equals(list2));
//		
//
//	}
//
//}





// SET THEORY

//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Collections1 {
//	
//	
//	public static void main (String[]args) {
//		List<Integer> list = new ArrayList<Integer>(); 
//		 
//		
//		list.add(4);
//		list.add(8);
//		list.add(10);
//		list.add(4);
//		
//		
//		list.add(0, 7);
//		System.out.println(list);
//		System.out.println(list.set(2, 40));
//		System.out.println(list);
//		
//
//	}
//
//}



//INDEX OF && CONTAINS METHOD


//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Collections1 {
//	
//	
//	public static void main (String[]args) {
//		List<Integer> list = new ArrayList<Integer>(); 
//		 
//		
//		list.add(4);
//		list.add(8);
//		list.add(10);
//		list.add(4);
//		
//	
//		
//		System.out.println(list.indexOf(10));
//		System.out.println(list.contains(4));
//		
//
//	}
//
//}





// LINKEDLIST


// GET FIRST && GET LAST METHOD

//
//public class Collections1 {
//	
//	
//	public static void main (String[]args) {
//		LinkedList<String> linkedList = new LinkedList<String>(); 
//		 
//		
//		linkedList.add("Druti");
//		linkedList.add("Saha");
//		
//		System.out.println(linkedList.getFirst());
//		System.out.println(linkedList.getLast());
//		
//
//	}
//
//}


// SET 

//import java.util.HashSet;
//import java.util.Set;
//
//public class Collections1 {
//
//
//public static void main (String[]args) {
//	Set<String> set = new HashSet<String>(); 
//	
//	set.add("Druti");  set.add("Megha");   set.add("Megha");
//	
//	for(String s : set) {
//		System.out.println(s);
//	}
//	
//}
//}



// HOW SET MAINTAIN UNIQUENESS


//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	int i = 9, j = 8;
//}
//
//public class Collections1 {
//
//
//public static void main (String[]args) {

//	Set<A> set = new HashSet<A>(); 09
//	
//	A a1 = new A();  A a2 = new A(); A a3 = new A();
//	
//	set.add(a1);  set.add(a2);   set.add(a3);
//	
//	for(A a : set) {
//		System.out.println(a);
//	}
//	
//}
//}




// Hashcode and equals method



//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	int i = 9, j = 8;
//	
//	public boolean equals(Object o) {
//		System.out.println("Equals");
//		
//		A a = (A)o;
//		
//	    if(this.i == a.i ) {
//	    	return true;
//	    }else {
//	    	return false;
//	    }
//		
//	}
//	public int hashCode() {
//		System.out.println("hashcode");
//		return 7;
//		
//	}
//}
//
//public class Collections1 {
//
//
//public static void main (String[]args) {
//	Set<A> set = new HashSet<A>(); 
//	
//	A a1 = new A();  A a2 = new A(); A a3 = new A();
//	
//	set.add(a1);  set.add(a2);   set.add(a3);
//	
//	
//	
//	for(A a : set) {
//		System.out.println(a);
//	}
//	
//}
//}

//
////TREESET
//
//
//class Iphone implements Comparable<Iphone>{
//	int manufacturingDate;
//	int curbWeight;
//	int price;
//	String color;
//	public int compareTo(Iphone o) {
//		int value = 0;
//      System.out.println("ComoareTo");
//		if(this.price<o.price )  {
//			value = -1;
//		}else if(this.price>o.price)  {
//			value = 1;
//		}
//		return value;
//	}
//	class manufacturingDateComparator implements Comparator<Iphone>{
//		public int compare(Iphone o1,Iphone o2) {
//			int value = 0;
//			if(o1.manufacturingDate<o2.manufacturingDate )  {
//				value = -1;
//			}else if(o1.manufacturingDate>o2.manufacturingDate)  {
//				value = 1;
//			}
//			return value;
//		}
//
//		
//	}
//	public String toString() {
//		return "manufacturing date is " +manufacturingDate+"color is"+color+" price is"+price;
//	}
//	
//	
//public class Collections1{
//	public static void main(String[]args) {
//		Set<Iphone> set = new TreeSet<Iphone>(new manufacturingDateComparator());
//		Iphone a1 = new Iphone(); Iphone a2 = new Iphone(); Iphone a3 = new Iphone();
//		
//		
//		a1.price=23; a2.price=56; a3.price = 76;
//		a1.manufacturingDate=25; a2.manufacturingDate=9; a3.manufacturingDate=1;
//		
//		set.add(a1); set.add(a2); set.add(a3);
//		
//		
//		for(Iphone i : set) {
//			System.out.println(i);
//		}
//	}
//	
//}
//}

//MAP 






