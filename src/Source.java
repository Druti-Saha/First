import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

//class ExceptionCheck {
//	static ArrayList<String> numberCheck(String str) {
//		ArrayList<String> list = new ArrayList<String>();
//
//		for (int i = 0; i < str.length(); i++) {
//
//			try {
//				if (Character.isDigit(str.charAt(i))) {
//					list.add("" + str.charAt(i));
//
//				}
//
//				else {
//					list.add("For input string: " + "\" " + str.charAt(i) + "\" ");
//					throw new NumberFormatException();
//				}
//
//			}
//
//			catch (Exception e) {
//				
//			}
//		}
//
//		return list;
//	}
//
//	static String FileCheck(String filename) {
//		File file = new File(filename);
//		String message = "FileNotFoundException";
//		try {
//			if(file.exists()) {
//				message ="File Found";
//			}else {
//				 return message;
//			}
//		}catch(Exception e){
//			
//		 }
//		return message;
//	
//
//}
//}
//
//public class Source {
//	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(Sytem.in);
//		
//
//		ArrayList<String> list = ExceptionCheck.numberCheck(str);
//		System.out.println(list);
//		String file = ExceptionCheck.FileCheck(filename);
//		System.out.println(file);
//		
//
//	}
//
//}



//public class Source {
//	public static void main(String[] args) {
//		
//		String s1 = "Druti Saha";
//		String s2 = "aeiou";
//		String FinalString = "";
//		
//		
//		
//		for (int i = 0; i<s1.length(); i++) {
//			for(int j=i; j<s2.length();j++) {
//				FinalString = FinalString + s1.charAt(i)+ s2.charAt(j);
//				break;
//				}
//			}
//		}
//		
//		System.out.println(FinalString);
//	}
//
//}
//
//
