

public class ConsoleSales extends Consoles {
    
    // Constructor
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }
    
    // Report method
    public void printReport() {
        System.out.println();
        System.out.println("==================================");
        System.out.println("       CONSOLE SALES REPORT       ");
        System.out.println("==================================");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : R" + getTotalSales());
        System.out.println("==================================");
    }
}