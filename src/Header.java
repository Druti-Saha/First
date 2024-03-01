class Header {
    String from;
    String to;
 
    public Header(String from, String to) {
        this.from = from;
        this.to = to;
    }
}
 
class Email {
    EmailOperations header;
    String body;
    String greetings;
 
    public Email(EmailOperations header, String body, String greetings) {
        this.header = header;
        this.body = body;
        this.greetings = greetings;
    }
}
 
class EmailOperations {
    public int emailVerify(Email e) {
        String regex = "[a-zA-Z_][a-zA-Z_0-9]*@[a-zA-Z]+\\.[a-zA-Z]+";
 
        boolean fromValid = e.header.from.matches(regex);
        boolean toValid = e.header.to.matches(regex);
 
        if (fromValid && toValid) {
            return 2;
        } else if (fromValid || toValid) {
            return 1;
        } else {
            return 0;
        }
    }
 
    public String bodyEncryption(Email e) {
        StringBuilder encryptedBody = new StringBuilder();
 
        for (char c : e.body.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) (((c - base + 3) % 26) + base);
                encryptedBody.append(encryptedChar);
            } else {
                encryptedBody.append(c);
            }
        }
 
        return encryptedBody.toString();
    }
 
    public String greetingMessage(Email e) {
        String name = e.header.from.split("@")[0];
        return e.greetings + " " + name;
    }
 
    public static void main(String[] args) {
        EmailOperations header = new EmailOperations("sender@doselect.com", "receiver@doselect.com");
        Email email = new Email(header, "Hello there!", "Regards");
 
        EmailOperations emailOperations = new EmailOperations();
 
        System.out.println("Email Verification Result: " + emailOperations.emailVerify(email));
        System.out.println("Encrypted Body: " + emailOperations.bodyEncryption(email));
        System.out.println("Greeting Message: " + emailOperations.greetingMessage(email));
    }
}





//Exception Handling question 4:

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
public class Header {
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