//
//class Age {
//    String drink;
//    String vote;
//    String movie;
//}
// 
//class IllegalAgeException extends Exception {
//    public IllegalAgeException(String s) {
//        super(s);
//    }
//}
// 
//public class ExceptionCheck {
//    public String drinkingCheck(Age a, int age) {
//        try {
//            if (age < 21) {
//                a.drink = "illegal";
//                throw new IllegalAgeException("Illegal drinking age");
//            } else {
//                a.drink = "legal";
//            }
//        } catch (IllegalAgeException e) {
//            return e.getMessage();
//        }
//        return "Drinking age is " + a.drink;
//    }
// 
//    public String votingCheck(Age a, int age) {
//        try {
//            if (age < 18) {
//                a.vote = "illegal";
//                throw new IllegalAgeException("Illegal voting age");
//            } else {
//                a.vote = "legal";
//            }
//        } catch (IllegalAgeException e) {
//            return e.getMessage();
//        }
//        return "Voting age is " + a.vote;
//    }
// 
//    public String movieCheck(Age a, int age) {
//        try {
//            if (age < 14) {
//                a.movie = "illegal";
//                throw new IllegalAgeException("Illegal movie-watching age");
//            } else {
//                a.movie = "legal";
//            }
//        } catch (IllegalAgeException e) {
//            return e.getMessage();
//        }
//        return "Movie-watching age is " + a.movie;
//    }
// 
//    public static void main(String[] args) {
//        ExceptionCheck exceptionCheck = new ExceptionCheck();
//        Age person = new Age();
// 
//        System.out.println(exceptionCheck.drinkingCheck(person, 20));
//        System.out.println(exceptionCheck.votingCheck(person, 17));
//        System.out.println(exceptionCheck.movieCheck(person, 15));
//    }
//}



 

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
 
//public class ExceptionCheck {
// 
//    public ArrayList<String> numberCheck(String str) {
//        ArrayList<String> result = new ArrayList<>();
//        for(char c : str.toCharArray()) {
//        	try {
//                if (Character.isDigit(c)) {
//                    result.add(String.valueOf(c));
//                } else {
//                    throw new NumberFormatException("For input string: \"" + c + "\"");
//                }
//            }
//         catch (NumberFormatException e) {
//            result.add(e.getMessage());
//        }
//        }
// 
//        return result;
//    }
// 
//    public String fileCheck(String filename) {
//        try {
//            File file = new File(filename);
// 
//            if (file.exists()) {
//                return "File Found";
//            } else {
//                throw new FileNotFoundException("File not found: " + filename);
//            }
//        } catch (FileNotFoundException e) {
//            return e.getMessage();
//        }
//    }
// 
//    public static void main(String[] args) {
//        ExceptionCheck exceptionCheck = new ExceptionCheck();
// 
//        // Example for numberCheck
//        String str = "10ASD";
//        ArrayList<String> resultNumberCheck = exceptionCheck.numberCheck(str);
//        System.out.println(resultNumberCheck);
// 
//        // Example for fileCheck
//        String filename = "abc.txt";
//        String resultFileCheck = exceptionCheck.fileCheck(filename);
//        System.out.println(resultFileCheck);
//    }
//}



class TypeException extends Exception {
    @Override
    public String toString() {
        return "Vehicle Type Not Set";
    }
}
class Vehicles {
    protected String type;
    protected String model_no;
    protected String model_name;
    protected String owner_name;
    protected String owner_details;
    public Vehicles() {}
    public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
        this.model_no = model_no;
        this.model_name = model_name;
        this.owner_name = owner_name;
        this.owner_details = owner_details;
    }
    public String get_type() {
        return type;
    }
    public String retrieve() {
        return "null";
    }
}
class Car extends Vehicles {
    public Car() {
        super();
    }
    public Car(String model_no, String model_name, String owner_name, String owner_details) {
        super(model_no, model_name, owner_name, owner_details);
    }
    @Override
    public String get_type() {
        return type;
    }
    public void set_type(String type) {
        this.type = type;
    }
    @Override
    public String retrieve() {
        try {
            if (type == null) {
                throw new TypeException();
            } else {
                return model_no + ", " + model_name + ", " + owner_details + ", " + owner_name;
            }
        } catch (TypeException e) {
            return e.toString();
        }
    }
}
public class ExceptionCheck {
    public static void main(String[] args) {
        Car car1 = new Car("123", "Toyota", "John Doe", "johndoe@example.com");
        car1.set_type("SUV");
        System.out.println("Car Details:");
        System.out.println("Type: " + car1.get_type());
        System.out.println("Retrieved: " + car1.retrieve());
        
        Car car2 = new Car();
        car2.set_type(null);
        System.out.println("\nCar Details:");
        System.out.println("Type: " + car2.get_type());
        System.out.println("Retrieved: " + car2.retrieve());
    }
}


