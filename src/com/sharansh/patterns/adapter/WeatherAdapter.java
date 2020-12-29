package com.sharansh.patterns.adapter;

public class WeatherAdapter {

  public int findTemperature(int zipcode) {
    String city = null;
    if(zipcode == 560037){
      city = "Bangaluru";
    } else if(zipcode == 110047) {
      city = "Delhi";
    }

    WeatherFinder weatherFinder = new WeatherFinderImpl();
    int temperature = weatherFinder.find(city);
    return temperature;
  }
}
