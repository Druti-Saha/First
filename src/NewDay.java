//class Mother{
//	int heigth = 10;
//	int weight = 50;
//	public int heigth( int h) {
//		int height = 12;
//		return height;
//		
//	}
//	
//}
//class Daughter extends Mother{
//	int height = 15;
//	
//}
//
//
//['
//
//public class NewDay {
//	
//	public static void main(String[]args) {
//	   Daughter d = new Daughter();
//	   System.out.println(d.height);
//	   System.out.println(d.heigth(d.height));
//	   
//		 
//		
//		
//		
//		
//	}
//
//}




public static String decryptMessage(String encryptedMessage) {
        if(encryptedMessage == null || encryptedMessage.isEmpty()){
            return null;
        }
        String[] words = encryptedMessage.split("");
        StringBuilder reversedMessage = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            reversedMessage.append(words[i]).append("");
        }
        StringBuilder dM = new StringBuilder();
        for(int i = 0;i<reversedMessage.length();i++){
            char currentChar= reversedMessage.charAt(i);
            int count = 1;
            while(i+1<reversedMessage.length() && reversedMessage.charAt(i+1)==currentChar){
                count++;
                i++;
            }
            if(count>1){
                dM.append(currentChar).append(count);
            }else{
                dM.append(currentChar);
            }
        }
        return dM.toString().trim();
    }
 
}
public class NewDay{
	public static void main(String[]args) {
		 
		
	}
}




