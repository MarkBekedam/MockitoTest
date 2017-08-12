/*
This program is a tutorial to test the Mockito unit testing framework.
*/
package mockitotest;

import java.util.ArrayList;
import java.util.List;

//import static org.mockito.Mockito.*;

public class MockitoTest {

    Portfolio portfolio;
    StockService stockService;
    
    public static void main(String[] args) {
        
        MockitoTest test = new MockitoTest();
        System.out.println("*** StockMarket Program to illustrate Mockito Testing Framework ***");
        // Call the test "setMarketValue"
    }
    
    public void setUp() {
        // Create portfolio object that is to be tested.
        portfolio = new Portfolio();
        
        // Create the mock object.
        // Set the stockService to the portfolio.
    }
    
    public boolean setMarketValue() {
        
        // Create a list of stocks to be added to the portfolio.
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1", "Google", 10);
        Stock microsoftStock = new Stock("2", "Microsoft", 100);
        
        // Add the stocks to the list.
        stocks.add(googleStock);
        stocks.add(microsoftStock);
        
        // Add the list of stocks to the portfolio
        portfolio.setStocks(stocks);
        
        // Mock the behavior of stock service to return the value of various stocks.

        return true;
    }
}
