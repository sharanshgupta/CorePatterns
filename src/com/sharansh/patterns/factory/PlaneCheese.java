package com.sharansh.patterns.factory;

public class PlaneCheese implements Pizza {

  @Override
  public void preparePizza() {
    System.out.println("Preparing Cheese pizza");
  }

  @Override
  public void bake() {
    System.out.println("Baking Cheese pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cutting Cheese pizza");
  }
}
