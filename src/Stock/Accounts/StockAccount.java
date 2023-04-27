package Stock.Accounts;


import java.util.Scanner;

public class StockAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stock: ");
        int numofStocks = sc.nextInt();
        sc.nextLine();

        StockManage manage = new StockManage();

        for (int i=0; i<numofStocks; i++){
            System.out.println("Enter Details for Stock: " +i+ ";");
            System.out.print("Enter the Stock Name: ");
            String name = sc.nextLine();
            System.out.println("Enter the Number of Shares: ");
            int numofShare = sc.nextInt();
            System.out.print("Enter the Share Price");
            double sharePrice = sc.nextDouble();
            sc.nextLine();

            Stock stock = new Stock(name,numofShare,sharePrice);
            manage.addStock(stock);
            System.out.println();
        }

        manage.printStockReport();
    }
}
