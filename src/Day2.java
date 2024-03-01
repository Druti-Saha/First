//
//public class Day2 {
//
//	public static void main(String[] args) {
//	   Day2 day2 = new Day2();
//	   int returnedvalue = day2.add();
//	   System.out.println("The returned value is "+returnedvalue);
//	   
//
//	}
//	int add() {
//		int value = 100;
//		System.out.println("i am from add()"+value);
//		return value;
//	}
//
//}


//public class Day2 {
//	int i =4, j=6,k;
//
//	public static void main(String[] args) {
//	   Day2 day2 = new Day2();
//	   int returnedvalue = day2.add();
//	   day2.add();
//	   System.out.println(day2.k);
//	   System.out.println( returnedvalue );
//	   
//
//	}
//	int add() {
//		int value = 100;
//		value = i * value + j * i;
//		return value;
//	}
//
//}


//// Method argument

//public class Day2 {
//
//	public static void main(String[] args) {
//	   Day2 day2 = new Day2();
//	   day2.add(35,	45);
//	   
//
//	}
//	
//	void add( int value1,int value2 ) {
//		System.out.println("Inside add()......");
//		
//		
//    Swift swift = new Swift();
//	         swift.tyres();  swift.steeringWheel();
//	         
//	         
//	}
//}c

//
//class Car{

//	void tyres() {
//		System.out.println("inside tyres() of cars:"+mileage);
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//}
//public class Day2{
//	public static void main(String[] args) {
//		Car car = new Car();  
//		
//		Swift swift = new Swift();
//		
//		Car car1 = new Swift(); car1.steeringWheel(); // this is illegal since i am trying to call method 
//		                // "steeringWheel" on reference variable which is od car type. so it will look for "steeringwheel"
//		
//		
//	} 
//}




//class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:"+mileage);
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		Car c1 = new Car(); Car c2 = new Car(); Car c3 = new Car();
//		
//		Car[] cars = {c1, c2, c3};
//		for( int i = 0; i<cars.length; i++) {
//			System.out.println();
//			cars[i].tyres;
//		}
//		
//	} 
//}
//



//class Car{
//	
//	int tyres() {
//		System.out.println("inside tyres() of cars:");
//		return 1;
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Swift swift1 = new Swift(); Swift swift2 = new Swift(); Swift swift3 = new Swift();
//		
//		Swift swifts[] = {swift1, swift2, swift3};
//		for (Swift value: swifts) {
//			System.out.println(value.tyres());
//		}
//		
//	} 
//}



//
//class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:");
//		
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Swift swift1 = new Swift(); Swift swift2 = new Swift(); Swift swift3 = new Swift();
//		
//		Swift swifts[] = {swift1, swift2, swift3};
//		for (Swift value: swifts) {
//			
//			value.tyres();
//			value.steeringWheel();
//			
//		}
//		
//	} 
//}



//class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:");
//		
//				
//	}
//	
//  
//
//}
//class Swift{
//	
//	int i = 4;
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Swift swift1 = new Swift(); Swift swift2 = new Swift(); Swift swift3 = new Swift();
//		
//		Swift swifts[] = {swift1, swift2, swift3};
//		
//		swift1.i=50;   swift3.i=10;
//		
//		int sum = 0;
//		
//		for (Swift value: swifts) {
//			sum = sum + value.i;
//			System.out.println(sum);			
//			
//			
//		}
//		
//	} 
//}

//class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:");
//		
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	int i = 4;
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//};
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Car car1 = new Car();  Car car2 = new Car();
//		
//		Swift swift1 = new Swift(); Swift swift2 = new Swift(); Swift swift3 = new Swift();
//		
//		Car[] cars = {swift1, swift2, car2, swift3};
//
//		
//		for (Car car: cars) {
//			car.tyres();       		
//			
//			
//		}
//		
//	} 
//}



//CASTING


//class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:");
//		
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	int i = 4;
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//	}
//};
//
//public class Day2{
//	public static void main(String[] args) {
		
//		Car car1 = new Car();  
//		
//		Swift swift1 = new Swift();
//		Car car2 = new Car();
//		Car car3 = swift1;
//		
//		
//		Swift swift2 = swift1;
//		
//		System.out.println(swift1);
//		System.out.println(swift2);
//		System.out.println(car3); /// up-casting beacuse we are going up in the hiarchy. here i am assigning reference variable and is implicit type-casting since up casting is automatic..
		
		
//		System.out.println("Down casting............");
//		Car car = new Swift();
		
//		Swift swift1 = (Swift) car; /// down-casting is not automatic..
//		
//		}
//		
//	} 

//


//
//class Car{
//	
//	void tyres() {
//		System.out.println("Inside Tyres()of cars:");
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	int i = 4;
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("STEERING wheel:");
//		
//		
//	}
//};
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Car car1 = new Car();             Car car2 = new Car();
//		
//		Swift swift1 = new Swift();       Swift swift2 = new Swift(); 
//		
//		Car[] cars = {car1, swift1, car2, swift2};
//		int[] arr1 = {1,2,3,4};
//		for(int k: arr1) {
//			System.out.println(arr1[k]);
//		}
//		
//		for (Car car: cars) {
//			car.tyres();
//			
//			
//			if ( car instanceof Swift ) {
//				Swift sw = (Swift) car;
//				sw.steeringWheel();
//				System.out.println ("Intance of Swift");
//			}
//			
//			
//		}
//		
//	} 
//}



//public class Day2{
//	public static void main(String[] args) {
//		
//		Swift swift1 = new Swift(); Swift swift2 = new Swift(); Swift swift3 = new Swift();
//		
//		Swift[] swifts = {swift1, swift2, swift3};
//		
//		swift1.i=50;   swift3.i=10;
//		
//		int sum = 0;
//		
//		for (Swift value: swifts) {
//			sum = sum + value.i;
//			System.out.println(sum);			
//			
//			
//		}
//		
//	} 
//}


//POLYMORPHISM

// METHOD OVERRIDING(RUMTIME POLYMORPHISM)


//
//class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:"); // this is overridden method//
//		
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//		
//	}
//	void tyres() {
//		System.out.println("inside tyres of swift()");   // this is overridding method//
//    }
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Car swift = new Swift();  swift.tyres();
//			
//			
//		}
//		
//	} 


 //FINAL KEYWORD

// final class Car{
//	
//	void tyres() {
//		System.out.println("inside tyres() of cars:"); 
//		
//				
//	}
//	
//  
//
//}
//class Swift extends Car{
//	
//	
//	
//	
//	void steeringWheel() {
//		
//		System.out.println("inside streeringWheel() of swift  " );
//		
//	}
//	void tyres() {
//		System.out.println("inside tyres of swift()");   
//    }
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Car swift = new Swift();  swift.tyres();
//			
//			
//		}
//		
//	} 

//METHOD OVERLOADING OR METHOD ARGUMENT


//class Arithmetic{
//	
//	
//	
//	
//	void add(int i, int j) {
//		
//		System.out.println( i+j  );
//		
//	}
//	void add(int i, int j , int k) {
//		
//		System.out.println( i+j+k);
//	}
//	void add(double i, int j ) {
//		
//		System.out.println( i+j );
//	}
//	
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.add(10,30);
//		arithmetic.add(234.5677, 23);
//		arithmetic.add(23, 45, 67);
//		
//			
//			
//		}
//		
//	} 


//ABSTRUCT KEYWORD//

// abstract class Car{
//	 
//	 void steringWheel() {
//		 System.out.println("inside streeringWhee:");
//	 }
//	 
//	 abstract void ac() ;
//	 abstract void radio();
//		 
//	 }
//	 
//	
//
//  abstract class Polo extends Car{
//	 
//	 void ac () {
//		 System.out.println("inside Ac of polo:");
//	 }
// }
//  
//  class PoloGT extends Polo{
//	  void radio() {
//		  System.out.println("Insude radio of PoloGT:");
//		  
//	  }
//	  
//  }
// 
//public class Day2{
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		
//		polo.steringWheel();    polo.ac();
//		
//		Car car = new Polo();
//		
//		PoloGt gt = new PoloGT();
//		Polo polo = new PoloGT():
//		
//			
//		}
//		
//	} 


// INTERFACE(IMPLEMENTS)

//interface A{
//	void add();
//	void sub();
//	
//}
//
//class B implements A{
//	public void add() {
//		System.out.println("Inside add of B:");
//	}
//	public void sub() {
//		System.out.println("Inside sub of B:");
//	}
//}
//public void Day2{
//	public static void main(String[] agrs) {
//		B b = new B();
//		b.add(); b.sub();
//		A a = new A;
//	}
//}
//
//
//
//interface A{
//	void add();
//	void sub();
//	
//}
//interface B extends A{
//	void mul();
//}
//
//class C implements B{
//	public void mul() {
//		
//	}
//	public void add() {
//		System.out.println("Inside add of B:");
//	}
//	public void sub() {
//		System.out.println("Inside sub of B:");
//	}
//}
//public void Day2{
//	public static void main(String[] agrs) {
//		B b = new B();
//		b.add(); b.sub();
//		A a = new A;
//	}
//}

//interface A{
//	void add();
//	void sub();
//	
//}
//
//class B implements A{
//	public void add() {
//		System.out.println("Inside add of B:");
//	}
//	public void sub() {
//		System.out.println("Inside sub of B:");
//	}
//}
//public void Day2{
//	public static void main(String[] agrs) {
//		B b = new B();
//		b.add(); b.sub();
//		A a = new A;
//	}
//}
//
//
//


//interface A{ //you can implemented methods in interface java 1.8 onwards and that i done with the helpnof static or default keywords..
//	int i = 5;// you have to assign to interface variable since it is public static and final...
//	void add();
//	
//	default void sub() {
//		
//	}
//	static void mul() {
//		
//	}
//	
//	
//}
//
//public class Day2{
//	
//	public static void main(String[] agrs) {
//		System.out.println(A.i);
//	}
//}


//class A{
//	int i = 4;
//	A(int i){
//		this.i= i;
//		System.out.println("inside");
//	}
//	A(){
//		
//	}
//	
//}
//
//public class Day2{
//	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a);
//		
		
//	}
//}



// TAKING INPUT FROM USER....

//import java.util.Scanner;
//
//
//
//public class Day2{
//	public static void main(String[]args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name = scanner.nextLine();
//		System.out.println("my name is :"+name);
//		System.out.println("My name is druti");
//	}
//}
//


