public class AtmCard{
  public final double ATM_CHARGE = 2.50;
  public static final String DEF_ORDER_ID = "DEF-SOH-099";
  public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
  public static final double DEF_ORDER_TOTAL = 15.00;
  private String orderID;
  private int atmPIN;
  private String accountHolder;
  private double orderTotal;
  private String pizzaIngredients;
  private String sides;
  private String drinks;
  public AtmCard(){
    this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "";
        this.drinks = "";
  }
 
  public AtmCard(String orderID, String pizzaIngredients, double orderTotal, String sides, String drinks, int atmPIN, String accountHolder) {
    this.orderID = orderID;
    this.pizzaIngredients = pizzaIngredients;
    this.orderTotal = orderTotal;
    this.sides = sides;
    this.drinks = drinks;
    this.atmPIN = atmPIN;
    this.accountHolder = accountHolder;
  }
  
  public String getorderID(){
    return orderID;
  }

  public double getorderTotal(){
    return orderTotal;
  }

  public AtmCard(String holder, int atmPIN){
    this.atmPIN = atmPIN;
    accountHolder = holder;
  }

  public int getAtmPin(){
    return atmPIN;
  }

  public void setAtmPin(int pin){
    atmPIN = pin;
  }
  public void setAccountHolder(String holder){
    accountHolder = holder;
  }
  public String getAccountHolder(){
    return accountHolder;
  }
  public String getPizzaIngredients() {
    return pizzaIngredients;
}

public void setPizzaIngredients(String pizzaIngredients) {
    this.pizzaIngredients = pizzaIngredients;
}

public double getOrderTotal() {
    return orderTotal;
}

public void setOrderTotal(double orderTotal) {
    this.orderTotal = orderTotal;
}

public String getSides() {
    return sides;
}

public void setSides(String sides) {
    this.sides = sides;
}

public String getDrinks() {
    return drinks;
}

public void setDrinks(String drinks) {
    this.drinks = drinks;
}

private void printReceipt() {
    System.out.println("Order ID: " + orderID);
    System.out.println("Pizza Ingredients: " + pizzaIngredients);
    System.out.println("Order Total: " + orderTotal);
    System.out.println("Sides: " + sides);
    System.out.println("Drinks: " + drinks);
}

public void showReceipt() {
    printReceipt();
}

}
