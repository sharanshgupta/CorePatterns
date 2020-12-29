package com.sharansh.patterns.factory;

public class PizzaStore {

  public Pizza orderPizza(String type) {

    Pizza p = PizzaFactory.createPizza(type);

    p.preparePizza();
    p.bake();
    p.cut();

    return p;
  }
}
