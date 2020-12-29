package com.sharansh.patterns.factory;

public class PizzaFactory {

  public static Pizza createPizza(String type) {

    Pizza p = null;
    if (type.equalsIgnoreCase("cheese")) {
      p = new PlaneCheese();
    } else if (type.equalsIgnoreCase("chicken")) {
      p = new ChickenPizza();
    } else if (type.equalsIgnoreCase("veg")) {
      p = new VegPizza();
    }

    return p;
  }
}
