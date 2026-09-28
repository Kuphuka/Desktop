

import electronicsstoreapp.*;

public abstract class Consoles implements IConsoles {
    
    // Variables
    protected String consoleType;
    protected String storeName;
    protected int totalSales;
    
    // Constructor
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    // Getters (required by IConsoles interface)
    @Override
    public String getConsoleType() { return consoleType; }
    
    @Override
    public String getStore() { return storeName; }
    
    @Override
    public int getTotalSales() { return totalSales; }
}