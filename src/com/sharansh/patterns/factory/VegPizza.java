package com.sharansh.patterns.factory;

public class VegPizza implements Pizza {

  @Override
  public void preparePizza() {
    System.out.println("Preparing Veg pizza");
  }

  @Override
  public void bake() {
    System.out.println("Baking Veg pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cutting Veg pizza");
  }
}
