package com.driver;

public class Main {
  public static void main(String[] args) {

    boolean Veg=true;
    boolean non_Veg=false;

    DeluxePizza dp = new DeluxePizza(Veg);

    System.out.println(dp.getBill());

    Pizza p = new Pizza(Veg);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addTakeaway();
    p.getBill();
    System.out.println(p.getBill());
  }
}