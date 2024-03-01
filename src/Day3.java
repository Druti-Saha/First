//
//creating a class and accessings different object of that class also changing the method parameters and attributes of that object.
//
//class Arithmetic{
//
//    int firstNo = 4;
//    int secondNo = 5;
//    int result;
//   
//    public void add( Arithmetic arithmectic) {
//       
//        result = firstNo + arithmetic.secondNo;
//        system.out.println(result);
//        
//
//   
//}
//
//public class Day3{
//
//     public static void main(String[] args){
//    
//       Arithmetic a1 = new Arithmetic;
//       Arithmetic a2 = new Arithmetic;
//       
//      a1.firstNo = 100; a2.firstNo = 200 ; 
//
//      a1.add(a2);    
//   }
//
//}
//
//
//
//
//EQUALS METHOD
//
//class Arithmetic{
//
//    int firstNo = 4;
//    
//    public boolean(Object obj){
//
//     Arithmetic a2 = (Arithmetic)obj;
//     if( firstNo == a2.firstNo){
//        return true;
//      }
//      else{
//           return false;
//          }
//   
//}
//
//   
//
//public class Day3{
//
//     public static void main(String[] args){
//    
//       Arithmetic a1 = new Arithmetic;
//       Arithmetic a2 = new Arithmetic;
//       
//      
//
//      
//      boolean status =  a1.equals(a2);
//
//     system.out.println(status);// the output wil be false but as the content of the two object is same stil it is not giving me true as the output because it checks only the address of the object.
//   }
//
//}
//
//
//
//TOSTRING METHOD 
//
//
//
//class Arithmetic{
//
//    
// int  i = 1, j = 2, k = 3, l = 9, m = 8, n = 6;
//
//   public String toString(){
//     return("value of"+i +"value of"+j + "value of"+m)
//}
//
//public class Day3{
//
//     public static void main(String[] args){
//    
//       Arithmetic a1 = new Arithmetic,  a1.i = 100;
//       Arithmetic a2 = new Arithmetic,
//
//     system.out.println(a1.toString());
//     system.out.println(a2.toString());
//   }
//
//}
//
//
//STRING --- its is a lang package




//public class Day3{
//
//   public static void main(String[] args){
//	   
//	   String str = new String("Abc");
//	   System.out.println(str); // "str" is a reference variable and when i say "str" in sysout
//	                           // then it should print us the address od the location but it prints us 
//	                           // the content not address. the reason is since the string class has
//                               // the tostring method in string class...
// }
//
//}

//
//public class Day3{
//
//	   public static void main(String[] args){
//		   
//		   char arr[] = {'M', 'D', 'R', 'a'}; 
//		   
//		   for(int i = 0; i<arr.length; i++) {
//			   if(arr[i]== 'a') {
//				   arr[i]= 'r';
//			   }
//		   }
//		   for(char ch:arr)
//		   
//		   System.out.print(ch); 
//	 }
//
//	}


//public class Day3{
//
//   public static void main(String[] args){
//	   
//	   char arr[]= {'D','R','U','T','I'};
//	   
//	   String str = new String(arr);
//	   
//	   System.out.println(str); // array is convertable into string.
//	   
//	    String newstr = str.replace('R', 'r'); // we have to create a new object to change the string.
//	   System.out.println(newstr); // as string is immutable it cannot be change. 
// }
//
//}





//public class Day3{
//
//   public static void main(String[] args){
//	   
//	   
//	   
//	   String str = "DRUTI"; // here i am creating object but not with new keyword..
//	   
//	   System.out.println(str); // array is convertable into string.
//	   
//	    String newstr = str.replace('R', 'r'); // we have to create a new object to change the string.
//	    System.out.println(newstr); // as string is immutable it cannot be change. 
// }
//
//}

// REPLACE METHOD

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	   String str = "abc";
//	   
//	   str.replace('b', 'd');
//	  String str1= str.replace('b', 'd');
//	   
//	   System.out.println(str); 
//	   
//	   System.out.println(str1);
//	   
//	     
// }
//
//}

//STARTSWITH METHOD--- IT IS A OVERLOADED METHOD

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	   String str = "abc";
//	   
//	   boolean br = str.startsWith("bc");
//	   boolean bl = str.startsWith("bc", 1);
//	   
//	   System.out.println(br); 
//	   
//	   System.out.println(bl);
//	   
//	     
// }
//
//}

// CONCAT METHOD

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	   String str = "abc";
//	   String str1 = str.concat("deb");
//	   
//	   
//	   
//	   System.out.println(str); 
//	   
//	   System.out.println(str1);
//	   
//	     
// }
//
//}

// IF WE WANT TO ADD THE CONTENT IN THE FIRST OF AN OBJECT THAT IS ALREADY THERE.
//
//public class Day3{
//
//	   public static void main(String[] args){
//		   
//		  
//		   
//		   String str = "abc";
//		   String str1 = "deg";
//		   
//		  
//		   
//		   System.out.println(str1+str); 
//		   
//		   
//		   
//		     
//	 }
//
//	}

// charAt() METHOD

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	   String str = "abc";
//	   
//	   char ch = str.charAt(2);
//	   
//	   
//	   System.out.println(ch); 
//	   
//	   
//	   
//	     
// }
//
//}

//indexOf() METHOD-- it will shows as the index of the 
//character but only the first one which is present will show that only..
// like in this code i want the index of b showit wil only show me the position of first 'b'..

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	   String str = "abcgfjhgihiufhtfkjhiou";
//	   int i = str.indexOf('b');
//	
//	   
//	   
//	   System.out.println(i); 
//	   
//	   
//	   
//	     
// }
//
//}

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	  int i = 4;
//	  int j = 5;
//	  
//	   
//	   
//	   
//	   
//	   System.out.println("the additon of" +i+j); // if e add anything with string it becomes string
//	   System.out.println(i+j+"the additon of");
//	   System.out.println("the additon of"+(i+j));
//	   
//	   
//	   
//	     
// }
//
//}

// converting int to string

//public class Day3{
//
//   public static void main(String[] args){
//	   
//	  
//	   
//	  int i =  46897;
//	  
//	  String str = ""+i;
//	   System.out.println(str); 	   
//	     
// }
//
//}










