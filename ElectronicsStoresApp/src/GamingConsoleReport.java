package electronicsstoreapp;

public class GamingConsoleReport {

    public static void main(String[] args) {
        
        // ---- 1. Declare arrays ----
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // Columns: [0]=PS5, [1]=XBOX, [2]=SWITCH
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };
        
        int[] cityTotals = new int[cities.length];
        
        // ---- 2. Report Header ----
        System.out.println("=========================================================");
        System.out.println("                GAMING CONSOLE REPORT");
        System.out.println("=========================================================");
        System.out.printf("%-18s %-12s %-12s %-12s%n", "", "PS5", "XBOX", "SWITCH");
        
        // ---- 3. Print sales table + calculate totals ----
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-12d %-12d %-12d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
            
            cityTotals[i] = sales[i][0] + sales[i][1] + sales[i][2];
        }
        
        // ---- 4. Print city totals ----
        System.out.println("---------------------------------------------------------");
        System.out.println("        CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------");
        
        int maxSales = 0;
        String topCity = "";
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %d%n", cities[i], cityTotals[i]);
            
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }
        
        // ---- 5. Print top city ----
        System.out.println("---------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("=========================================================");
    }
}