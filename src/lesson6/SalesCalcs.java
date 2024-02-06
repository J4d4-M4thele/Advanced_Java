package lesson6;

public interface SalesCalcs {

  public static final String reportTitle="\n==Static List Report==";
  public String getName();
  public double calcSalesPrice();
  public double calcCost();
  public double calcProfit();

  //using default keyword to add body to method
  public default void printItemData(SalesCalcs item) {
    System.out.println("--" + item.getName() + " Report--");
    System.out.println("Sales Price: " + item.calcSalesPrice());
    System.out.println("Cost: " + item.calcCost());
    System.out.println("Profit: " + item.calcProfit());
  }

  public static void printItemArray(SalesCalcs[] items){
    System.out.println(reportTitle);
    for(SalesCalcs item:items){
      System.out.println("--" + item.getName() + " Report--");
      System.out.println("Sales Price: " + item.calcSalesPrice());
      System.out.println("Cost: " + item.calcCost());
      System.out.println("Profit: " + item.calcProfit());
    }
  }
}
