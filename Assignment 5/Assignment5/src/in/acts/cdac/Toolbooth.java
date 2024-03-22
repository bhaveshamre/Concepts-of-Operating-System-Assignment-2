package in.acts.cdac;
import java.lang.*;
import java.util.Scanner;

public class Toolbooth {
    private String vehicleType; // A string field to store the type of vehicle.
    private int numAxles; // An integer field to store the number of axles.
    private double distanceTraveled; // A double field to store the distance traveled.
    private double tollFee;
    private double totalAmountDue;
    
    
    public double calculateTollFee() {
        if (numAxles <= 4) {
            tollFee = 0.25 * numAxles * distanceTraveled;
        } else {
            tollFee = 0.50 * numAxles * distanceTraveled;
        }
        return tollFee;
    }
    
    public void generateBill() {
        totalAmountDue = tollFee + 2.00;
        System.out.println("=======================================");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number of Axles: " + numAxles);
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Toll Fee: $" + tollFee);
        System.out.println("Total Amount Due: $" + totalAmountDue);
        System.out.println("=======================================");
        
    }
    
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {  
            System.out.println("1. Enter vehicle type (car, van, bus, or truck)\r\n"
                    + "2. Enter number of axles\r\n"
                    + "3. Enter distance travelled\r\n"
                    + "4. Calculate toll fee\r\n"
                    + "5. Generate bill\r\n"
                    + "6. Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter vehicle type: ");
                    sc.nextLine(); // consume newline
                    vehicleType = sc.nextLine();
                    break;
                    
                case 2:
                    System.out.println("Enter number of axles: ");
                    numAxles = sc.nextInt();
                    break;
                    
                case 3:
                    System.out.println("Enter distance traveled (in miles): ");
                    distanceTraveled = sc.nextDouble();
                    break;
                    
                case 4:
                    if (vehicleType == null || numAxles == 0 || distanceTraveled == 0) {
                        System.out.println("Please enter vehicle type, number of axles, and distance traveled first.");
                    } else {
                        calculateTollFee();
                        System.out.println("Toll fee calculated. ");
                    }
                    break;
                
                case 5: 
                    if (vehicleType == null || numAxles == 0 || distanceTraveled == 0) {
                        System.out.println("Please enter vehicle type, number of axles, and distance traveled first.");
                    } else {
                        generateBill();
                        System.out.println("Bill Generated. ");
                    }
                    break;
                    
                case 6: 
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                    
                default: 
                    System.out.println("Invalid choice.");
            }
        }
    }
    

    public static void main(String[] args) {
        
        Toolbooth t = new Toolbooth();
        
        t.showMenu();

    }
}
