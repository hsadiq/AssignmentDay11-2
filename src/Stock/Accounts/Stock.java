package Stock.Accounts;

public class Stock {
    public Stock(String name, int numofShare, double sharePrice) {
        this.name = name;
        this.numofShare = numofShare;
        this.sharePrice = sharePrice;
    }

    private String name;
    private int numofShare;
    private double sharePrice;

    public String getName() {
        return name;
    }

    public int getNumofShare() {
        return numofShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getValue() {
        return numofShare * sharePrice;
    }
}

