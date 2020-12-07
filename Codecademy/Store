public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  //For example, product is of type String because that value is assigned to the instance field String productType.
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    /*
    Creation d'une nouvelle instance de Store called cookieShop
    Ici on determine : Store cookieShop est un nouveau Store contenant (des cookies aux nombre de 12 et au prix de 3.75)
    */
    Store cookieShop = new Store("cookies", 12, 3.75); 
  }
}






public class Store {
  // instance fields
  String productType;
  public void advertise() {
   System.out.println("Come spend some money!");

   /* 
    Ici pour inserer une variable productType on ajoute un + devant et derriere car on veux continuer le print
   */ 
   System.out.println("Selling " + productType + "!");

  }
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
    //Ici on appel la method advertise dans la method main pour l'integrer
    // de ce faite le texte sera affiché x3

    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
  }
}