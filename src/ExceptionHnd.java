import java.util.Scanner;

//public class ExceptionHnd {
//	public static void main(String[]args) {
//		int i= 4;
//		System.out.println(i/0);
//		
//	}	
//	
//
//}

//public class ExceptionHnd {
//	public static void main(String[]args) {
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr[7]);
//		
//	}	
//	
//
//}

//public class ExceptionHnd {
//	public static void main(String[]args) {
//		try {
//			System.out.println("Inside try block");
//			int i = 4;
//			int result = 4/0;
//			System.out.println(result);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		
//			System.out.println("Inside catch block");
//		}
//		
//	}	
//	
//
//}

//public class ExceptionHnd {
//	 static int counter = 0;
//	public static void main(String[]args) {
//		
//		try {
//          Scanner sc = new Scanner(System.in);
//			if(counter == 0) {
//				
//				System.out.println("Enter divider but not 0!!");
//			}
//		
//		      
//		
//		
//		      int divider = sc.nextInt();
//		      
//		      int dividend = 4;
//		      int result = dividend/divider;
//		      
//		      System.out.println("the result:"+result);
//		}
//		catch (Exception e) {
//			
//			System.out.println("Inside Catch block");
//			System.out.println(e);
//			
//			System.out.println("I have told you not to print 0 ");
//			counter++;
//     		main(null);
//     		
//			
//		}
//		
//		
//	}	
//	
//
//}

//public class ExceptionHnd {
//	 static int counter = 0;
//	public static void main(String[]args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//				
//			 System.out.println("Enter divider but not 0!!");
//		
//		      int divider = sc.nextInt();
//		      
//		      int dividend = 4;
//		      int result = dividend/divider;
//		      
//		      System.out.println("the result:"+result);
//		      int[] arr= {3,5,6};
//		      System.out.println("Enter index of array!!");
//		      int index = sc.nextInt();
//		      System.out.println(arr[index]);
//		      
//		      System.out.println("Enter name");
//		      String name = sc.next();
//		      System.out.println("Enter the index of string!");
//		      int indexString = sc.nextInt();
//		      System.out.println(name.charAt(indexString));
//		}
//		catch (ArithmeticException e) {
//			
//			
//			System.out.println("I have told you not to print 0 ");
//			
//    		main(null);
//    		
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Inside ArrayIndexOutOfBound");
//		}
//		catch(Exception e) {
//			System.out.println("Inside just exception");
//			main(null);
//		}
//		
//		
//	}	
//	
//
//}

//public class ExceptionHnd {
//	static Scanner sc = new Scanner(System.in);
//
//public static void main(String[]args) {
//
//	static void divider() {
//	
//	    try {
//		
//		
//			
//		 System.out.println("Enter divider but not 0!!");
//	
//	      int divider = sc.nextInt();
//	      
//	      int dividend = 4;
//	      int result = dividend/divider;
//	      
//	      System.out.println("the result:"+result);
//	    }
//	    
//	    catch (ArithmeticException e) {
//		
//		
//		System.out.println("Inside Arithmetic");
//		
//		divider();
//	    }
//	}
//	}
//	static void
//	    
//	
//
//	    
//	    
//
//
//	
//}
//}
//}

//Exception Propagation
//
//public class ExceptionHnd  {
//
//
//public static void main(String[]args) {
//	int i = 4/0;
//}
//}


//USERDEFINED EXCEPTION

//import java.util.Scanner;
//public class ExceptionHnd  {
//
//
//  public static void main(String[]args) throws Exception {
//	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter the age");
//	  int age = sc.nextInt();
//	  if(age>30) {
//		  System.out.println("You are not allowed");
//		  throw new AgeAbove30NotAllowed();
//	  }else {
//		  System.out.println("Welcome");
//	  }
//	  
//	
//}
//}


//import java.util.Scanner;
//public class ExceptionHnd  {
//
//
//  public static void main(String[]args)  {
//	  try {
//		  ageCheck();  
//	  }
//	  catch{
//		  System.out.println("Inside Catch");
//	  }
//	  
//  }
//   static public void ageCheck() throws Exception {
//	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter the age");
//	  int age = sc.nextInt();
//	  if(age>30) {
//		  System.out.println("You are not allowed");
//		  throw new AgeBelow30Allowed();
//	  }else {
//		  System.out.println("Welcome");
//	  }
//  }  
//	  
//	
//}

//unchecked & checked 

//import java.util.Scanner;
//
//public class ExceptionHnd  {
//
//
//  public static void main(String[]args) throws Exception {
//	  ageCheck();
//  }
//	 
//	  
//   static public void ageCheck() throws Exception {
//	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter the age");
//	  int age = sc.nextInt();
//	  if(age>30) {
//		  System.out.println("You are not allowed");
//		  throw new AgeAbove30NotAllowed();
//	  }else {
//		  System.out.println("Welcome");
//		  throw new AgeBelow30Allowed();
//		  
//	  }
//  }  
//  }
	  
	







