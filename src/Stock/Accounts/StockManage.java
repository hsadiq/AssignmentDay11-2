package Stock.Accounts;

import java.util.ArrayList;
import java.util.List;

public class StockManage {

        private List<Stock> stocks;

        public StockManage(){
            stocks = new ArrayList<>();
        }
        public void addStock(Stock stock){
            stocks.add(stock);
        }

        public double getValueofStock(Stock stock){
            return stock.getValue();
        }

        public double getTotalValueofStock(){
            double totalValue =0;
            for (Stock stock : stocks) {
                totalValue += stock.getValue();
            }
            return totalValue;
        }

        public void printStockReport(){
            System.out.println("Stock Report: ");
            for (Stock stock : stocks){
                System.out.println("Stock Name: " + stock.getName());
                System.out.println("Number of Shares: " + stock.getNumofShare());
                System.out.println("Share Price: " + stock.getSharePrice());
                System.out.println("Stock Value: " + getValueofStock(stock));
                System.out.println();
            }
            System.out.println("Total Value of Stocks: " + getTotalValueofStock());
        }

    }

