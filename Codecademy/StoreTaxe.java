public class StoreTaxe {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public StoreTaxe(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price + priceToAdd;
      price = newPrice;
    }
    
    // get price with tax method
    //On definis le prix de la taxe et on demande de nous retourner le nouveau prix avec la nouvelle taxe.
    public double getPriceWithTax() {
    double totalPrice = price + price * 0.08;
    return totalPrice;  
    }
  
    // main method
    public static void main(String[] args) {
      StoreTaxe lemonadeStand = new StoreTaxe("Lemonade", 3.75);
      double lemonadePrice = lemonadeStand.getPriceWithTax();
      System.out.println(lemonadePrice);
    }
  }