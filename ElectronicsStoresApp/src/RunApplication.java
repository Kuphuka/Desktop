

import java.util.Scanner;

public class RunApplication {
    
    public static void main(String[] args) {
        
        // ---- Ask the user for input ----
        try (Scanner input = new Scanner(System.in)) {
            // ---- Ask the user for input ----
            System.out.print("Enter the console device type (e.g., PS5, XBOX, SWITCH): ");
            String consoleType = input.nextLine();
            
            System.out.print("Enter the store name: ");
            String storeName = input.nextLine();
            
            System.out.print("Enter the total amount of sales: ");
            int totalSales = input.nextInt();
            
            // ---- Create the object and print the report ----
            ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
            sale.printReport();
        }
    }
}