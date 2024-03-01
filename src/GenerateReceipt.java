//
//import java.util.regex.*;
// 
//class TransactionParty {
//    String seller;
//    String buyer;
// 
//    public TransactionParty(String seller, String buyer) {
//        this.seller = seller;
//        this.buyer = buyer;
//    }
//}
// 
//class Receipt { 
//    TransactionParty transactionParty;
//    String productsQR;
// 
//    public Receipt(TransactionParty transactionParty, String productsQR) {
//        this.transactionParty = transactionParty;
//        this.productsQR = productsQR;
//    }
//}
// 
//public class GenerateReceipt {
// 
//    public int verifyParty(Receipt r) {
//        String sellerRegex = "^[a-zA-Z'\\- ]+$";
//        String buyerRegex = "^[a-zA-Z'\\- ]+$";
// 
//        boolean isSellerValid = Pattern.matches(sellerRegex, r.transactionParty.seller);
//        boolean isBuyerValid = Pattern.matches(buyerRegex, r.transactionParty.buyer);
// 
//        if (isSellerValid && isBuyerValid) {
//            return 2;
//        } else if (isSellerValid || isBuyerValid) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
// 
//    public String calcGST(Receipt r) {
//        String[] products = r.productsQR.split("@");
// 
//        int gstRate = 12;
//        int totalGST = 0;
// 
//        for (String product : products) {
//            String[] rateQuantity = product.split(","); 
//            int rate = Integer.parseInt(rateQuantity[0]);
//            int quantity = Integer.parseInt(rateQuantity[1]);
//            totalGST += rate * quantity;
//        }
// 
//        int gstValue = (totalGST * gstRate) / 100;
//        return Integer.toString(gstValue);
//    }
// 
//    public static void main(String[] args) {
//        TransactionParty party = new TransactionParty("John Doe", "Jane Smith");
//        Receipt receipt = new Receipt(party, "250,10@100,3@50,7");
// 
//        GenerateReceipt generator = new GenerateReceipt();
//        int partyVerificationResult = generator.verifyParty(receipt);
//        String gstValue = generator.calcGST(receipt);
// 
//        System.out.println("Party Verification Result: " + partyVerificationResult);
//        System.out.println("GST Value: " + gstValue);
//    }
//}


class Employee {
    String name;
    String ssn;
    String dept;
    int salary;
 
    public Employee(String name, String ssn, String dept, int salary) {
        this.name = name;
        this.ssn = ssn;
        this.dept = dept;
        this.salary = salary;
    }
}
 
class EmployeeImplementation {
    public Employee getEmployeeInfo(String str) {
        String[] parts = str.split("@|\\-|#");
 
        String name = parts[0].trim();
        String ssn = parts[1].trim();
        String dept = parts[2].trim();
        int salary = Integer.parseInt(parts[3].trim());
 
        return new Employee(name, ssn, dept, salary);
    }
 
    public String getEmployeeDept(Employee e) {
        String lastThreeDigits = e.ssn.substring(e.ssn.length() - 3);
 
        int ssnDigits = Integer.parseInt(lastThreeDigits);
 
        if (ssnDigits >= 1 && ssnDigits <= 60) {
            return "L1";
        } else if (ssnDigits >= 61 && ssnDigits <= 120) {
            return "L2";
        } else if (ssnDigits >= 121 && ssnDigits <= 180) {
            return "L3";
        } else {
            return "L4";
        }
    }
}
 
public class GenerateReceipt {
    public static void main(String[] args) {
        EmployeeImplementation employeeImplementation = new EmployeeImplementation();
 
        // Example string
        String employeeString = "Amit Rai@1PC16CS046-ALU#8";
 
        // Getting Employee information
        Employee employee = employeeImplementation.getEmployeeInfo(employeeString);
 
        // Displaying Employee information
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.name);
        System.out.println("SSN: " + employee.ssn);
        System.out.println("Dept: " + employee.dept);
        System.out.println("Salary: " + employee.salary);
 
        // Getting Employee department
        String department = employeeImplementation.getEmployeeDept(employee);
 
        // Displaying Employee department
        System.out.println("Employee Department: " + department);
    }
}