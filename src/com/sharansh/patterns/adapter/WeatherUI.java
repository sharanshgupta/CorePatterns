package com.sharansh.patterns.adapter;

public class WeatherUI {

  public static void showTemperature(int zipcode) {

    WeatherAdapter weatherAdapter = new WeatherAdapter();
    int temperature = weatherAdapter.findTemperature(zipcode);
    System.out.println("Temperature is " + temperature);
  }

  public static void main(String[] args) {
    showTemperature(110047);
  }
}
